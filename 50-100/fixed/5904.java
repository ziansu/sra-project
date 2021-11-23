private void handle(java.io.BufferedReader reader, java.io.PrintWriter writer) {
    java.lang.String str;
    try {
        while ((str = reader.readLine()) != null) {
            java.lang.String res = deliverMessage(str);
            writer.write((res + "\n"));
            writer.flush();
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace(java.lang.System.err);
    }
}