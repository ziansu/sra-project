@java.lang.Override
public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
    super.init(config);
    new java.lang.Thread(new at.jku.se.chatserver.Server()).start();
}