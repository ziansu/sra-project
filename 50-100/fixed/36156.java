public static void main(java.lang.String[] args) throws java.io.IOException, java.net.UnknownHostException {
    if (args[0].equals(null)) {
        args[0] = "localhost";
    }
    ru.Marksblog.Main.client = new java.net.Socket(args[0], 5555);
    ru.Marksblog.Main.th = new java.lang.Thread(ru.Marksblog.Main.mess);
    ru.Marksblog.Main.th.start();
    ru.Marksblog.Main.th2 = new java.lang.Thread(ru.Marksblog.Main.read);
    ru.Marksblog.Main.th2.start();
}