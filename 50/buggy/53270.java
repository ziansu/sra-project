public static void main(java.lang.String[] args) {
    com.innavace.ds.config.Configuration configuration = new com.innavace.ds.config.Configuration();
    java.lang.String originalSql = "UPDATE CONFIGURATIONS SET  KEYWORDS=? WHERE PATH=?";
    java.lang.System.out.println(configuration.stripOptions(originalSql));
    java.lang.System.out.println(configuration.getOptions(originalSql));
}