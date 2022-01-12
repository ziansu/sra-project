public void testDatabaseOutput(java.lang.String query) throws java.lang.Exception {
    java.io.File file1 = new java.io.File("C:/Users/ocraw/Desktop/cypher_results.txt");
    java.io.File file2 = new java.io.File("C:/Users/ocraw/Desktop/pg_results.txt");
    main_area.Cyp2SQL.cypherOutputToTextFile(query);
    java.lang.String sql = main_area.Cyp2SQL.convertQuery(query);
    java.lang.System.out.println(sql);
    main_area.Cyp2SQL.printPostgresToTextFile(sql);
    assertEquals(true, org.apache.commons.io.FileUtils.contentEquals(file1, file2));
}