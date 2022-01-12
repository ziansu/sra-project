@java.lang.Override
public java.lang.Object run() {
    try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(file, true))) {
        writer.write(content);
        writer.newLine();
    } catch (java.io.IOException e) {
        org.ansj.elasticsearch.pubsub.redis.FileUtils.logger.error("appendFile exception", e);
    }
    return null;
}