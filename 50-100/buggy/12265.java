@java.lang.Override
public void handle(com.sun.net.httpserver.HttpExchange exchange) throws java.io.IOException {
    mmKNIME.core.logMessage("µmKNIME: Handling overview request.");
    java.util.Scanner scanner = new java.util.Scanner(getFileStream()).useDelimiter("\\A");
    java.lang.String response = (scanner.hasNext()) ? scanner.next() : "";
    exchange.sendResponseHeaders(200, response.length());
    java.io.OutputStream os = exchange.getResponseBody();
    os.write(response.getBytes());
    os.flush();
    os.close();
}