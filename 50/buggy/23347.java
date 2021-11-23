public void run() {
    try {
        client.ClientFile frame = new client.ClientFile("", "");
        frame.setVisible(true);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}