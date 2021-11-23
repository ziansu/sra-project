public static void main(java.lang.String[] args) {
    java.io.FileReader reader = null;
    try {
        reader = new java.io.FileReader(args[0]);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        java.lang.System.err.println("Error opening File!");
        return ;
    }
    java.util.ArrayList<java.lang.String[]> records = CSV_Parser.CSV_Parser.parse_cleaned(reader);
    java.util.ArrayList<CSV_Parser.Tweet> tweets = null;
    tweets = Data_importer.create_tweets(records);
    Data_importer.send_to_db(tweets);
    return ;
}