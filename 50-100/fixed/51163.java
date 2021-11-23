public static void matchPatternGen() {
    org.apache.hadoop.hive.cli.VerifyQueryDriver.patterns.clear();
    java.lang.String[] keywords = new java.lang.String[]{ "Verify" , "Correlation" , "(\\w+[,( \\w+)]*)" , "nextLine" , "Piggybacking" , "(None|Map-only|MapReduce)" , "nextLine" , "[;]{0,1}" };
    org.apache.hadoop.hive.cli.VerifyQueryDriver.patterns.add(org.apache.hadoop.hive.cli.VerifyQueryDriver.matchPatternGen(keywords, org.apache.hadoop.hive.cli.VerifyQueryDriver.VQType.None));
    org.apache.hadoop.hive.cli.VerifyQueryDriver.patterns.add(org.apache.hadoop.hive.cli.VerifyQueryDriver.matchPatternGen(keywords, org.apache.hadoop.hive.cli.VerifyQueryDriver.VQType.MapOnly));
    org.apache.hadoop.hive.cli.VerifyQueryDriver.patterns.add(org.apache.hadoop.hive.cli.VerifyQueryDriver.matchPatternGen(keywords, org.apache.hadoop.hive.cli.VerifyQueryDriver.VQType.MapReduce));
}