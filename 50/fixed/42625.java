public static void main(java.lang.String[] args) {
    webserver.main.Main.sql = new webserver.main.MySQL();
    webserver.main.Main.server = new webserver.main.HTMLServer(webserver.main.Main.sql);
    webserver.main.Main.server.startServer();
}