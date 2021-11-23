@java.lang.Override
public void handle(final com.sun.net.httpserver.HttpExchange exchange) throws java.io.IOException {
    mmKNIME.core.logMessage("µmKNIME: Handling overview request.");
    final java.util.Scanner scanner = new java.util.Scanner(this.getFileStream()).useDelimiter("\\A");
    final java.lang.String response = (scanner.hasNext()) ? scanner.next() : "";
    exchange.sendResponseHeaders(200, response.length());
    final java.io.OutputStream os = exchange.getResponseBody();
    os.write(response.getBytes());
    os.close();
}