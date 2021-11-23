public void LogHandlerLoop() {
    java.lang.String Line = null;
    while (true) {
        try {
            Line = Reader.readLine();
            if (Line == null) {
                java.lang.Thread.sleep((1 * 1000));
            }else {
                ParseLine(Line);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (java.lang.InterruptedException e) {
            java.lang.System.out.println("BARF");
        }
    } 
}