public java.lang.String GetGameStatus() {
    try {
        java.lang.System.out.println("Getting Game Status...");
        m_Writer.writeBytes("getStatus,gamestate\n");
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
    try {
        java.lang.String tt = m_Reader.readLine();
        java.lang.System.out.println(("Gamestatus:" + tt));
        return tt;
    } catch (java.lang.NumberFormatException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}