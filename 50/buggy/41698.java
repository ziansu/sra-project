@java.lang.Override
public void init() throws javax.servlet.ServletException {
    com.nyleptha.martha.grammer.XMLParser.createXML("rules");
    super.init();
}