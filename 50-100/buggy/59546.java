@java.lang.Override
public com.lousylynx.slik.common.Response handle(com.lousylynx.slik.common.Request request, com.lousylynx.slik.common.Response response) {
    response.setType(ContentType.HTML);
    response.append((("This is a test. Click <a href=\"" + (com.lousylynx.slik.Slik.pathFor("home"))) + "\">here</a>.<br /> You inputted: <br /><ul>"));
    for (java.lang.String page : request.getInput("page")) {
        response.append((("<li>" + page) + "</li>"));
    }
    response.append("</ul>");
    return response;
}