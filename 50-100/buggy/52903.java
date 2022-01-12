public static void main(java.lang.String[] args) {
    main.Client client = new main.Client("127.0.0.1", 8000);
    java.lang.Thread thread = new java.lang.Thread(client);
    thread.start();
    client.connect();
    javax.swing.JFrame window = new javax.swing.JFrame("ZOOM and BOOM");
    window.setContentPane(client.applet);
    window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    window.setSize(1117, 690);
    window.setVisible(true);
}