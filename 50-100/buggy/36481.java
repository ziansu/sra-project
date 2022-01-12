@java.lang.Override
protected void doPost(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    java.util.Scanner scanner = new java.util.Scanner(req.getInputStream());
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    while (scanner.hasNextLine()) {
        sb.append(scanner.nextLine());
    } 
    java.lang.String json = sb.toString();
    java.lang.System.out.println(("Received: " + json));
    broadcaster.broadcast("message", info.macias.sse.servlet3.example.chat.ChatServlet.dirtyJsonParse(json));
}