@java.lang.Override
public void addException(com.puppycrawl.tools.checkstyle.api.AuditEvent evt, java.lang.Throwable throwable) {
    final java.io.StringWriter stringWriter = new java.io.StringWriter();
    final java.io.PrintWriter printer = new java.io.PrintWriter(stringWriter);
    printer.println("<exception>");
    printer.println("<![CDATA[");
    throwable.printStackTrace(printer);
    printer.println("]]>");
    printer.println("</exception>");
    printer.flush();
    this.writer.println(com.puppycrawl.tools.checkstyle.XMLLogger.encode(stringWriter.toString()));
}