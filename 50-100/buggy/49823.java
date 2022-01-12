@java.lang.Override
public java.lang.Object run() {
    try (java.io.FileWriter fw = new java.io.FileWriter(file, true)) {
        java.io.BufferedWriter writer = new java.io.BufferedWriter(fw);
        writer.write(content);
        writer.newLine();
    } catch (java.io.IOException e) {
        org.ansj.elasticsearch.pubsub.redis.FileUtils.logger.error("appendFile exception", e);
    }
    return null;
}