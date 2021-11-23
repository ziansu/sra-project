public static void writeMissedQuery(java.lang.String missedQuestion) {
    try {
        java.io.BufferedWriter out = new java.io.BufferedWriter(new java.io.FileWriter("logs/missedQuery.log", true));
        out.write((missedQuestion + "\n"));
        out.close();
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}