public com.ac.umkc.spark.TwitterUser call(java.lang.String line) throws java.lang.Exception {
    if ((line.trim().length()) == 0)
        return null;
    
    com.ac.umkc.spark.TwitterUser user = new com.ac.umkc.spark.TwitterUser();
    user.parseFromJSON(line);
    return user;
}