public static void main(java.lang.String[] args) throws java.io.IOException, java.net.UnknownHostException {
    ru.Marksblog.Main.client = new java.net.Socket("localhost", 5555);
    ru.Marksblog.Main.th = new java.lang.Thread(ru.Marksblog.Main.mess);
    ru.Marksblog.Main.th.start();
    ru.Marksblog.Main.th2 = new java.lang.Thread(ru.Marksblog.Main.read);
    ru.Marksblog.Main.th2.start();
}