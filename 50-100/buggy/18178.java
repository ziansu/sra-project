public void skickainput(java.lang.String dataToSend) {
    try {
        dataToSend = instruktion.next().toUpperCase();
        if ((dataToSend.equals("Q")) || (dataToSend.equals("QUIT"))) {
            flush();
            java.lang.System.out.println("Seriellport stängd. Ha en fortsatt trevlig dag.");
            java.lang.System.exit(1);
        }
        utdata.write(dataToSend.getBytes());
    } catch (java.lang.Exception e) {
        java.lang.System.err.println("Något gick fel med att skicka data.");
    }
}