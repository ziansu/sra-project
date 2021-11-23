public com.ac.umkc.spark.TwitterUser call(java.lang.String line) throws java.lang.Exception {
    com.ac.umkc.spark.TwitterUser user = new com.ac.umkc.spark.TwitterUser();
    user.parseFromJSON(line);
    return user;
}