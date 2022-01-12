public static void HistorySerializer(java.lang.String dayplan) {
    try {
        java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter("./History.Fitness", true)));
        out.println("<DayHistory>");
        out.print(dayplan);
        out.println("</DayHistory>");
        out.close();
    } catch (java.lang.Exception e) {
    }
}