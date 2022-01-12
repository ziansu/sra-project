public static com.mongodb.MongoClient createClientFromFlumeContext(org.apache.flume.Context context, java.lang.String prefix) {
    java.util.List<com.mongodb.ServerAddress> seeds = org.mapad.google.common.utils.MongoUtils.getSeeds(context.getString((prefix + (org.mapad.google.common.utils.MongoUtils.HOSTNAMES))));
    com.mongodb.MongoCredential credential = org.mapad.google.common.utils.MongoUtils.getCredential(context, prefix);
    com.mongodb.MongoClient client;
    if (credential != null) {
        client = new com.mongodb.MongoClient(seeds, java.util.Arrays.asList(credential));
    }else {
        client = new com.mongodb.MongoClient(seeds);
    }
    return client;
}