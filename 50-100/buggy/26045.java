public void render(java.lang.StringBuilder sbuf, ch.qos.logback.classic.spi.ILoggingEvent event) {
    (exceptionCount)++;
    ch.qos.logback.classic.spi.IThrowableProxy tp = event.getThrowableProxy();
    sbuf.append("<tr><td class=\"indent\"></td><td class=\"exceptionMessage\" colspan=\"").append(columnCount).append("\">");
    while (tp != null) {
        render(sbuf, tp);
        tp = tp.getCause();
    } 
    sbuf.append("</td></tr>");
}