private void display() throws java.io.IOException {
    java.io.File htmlFile = new java.io.File((((((br.com.hammeredsoft.mailoff.util.MailOffConf.getWorkDir()) + (java.io.File.separator)) + (br.com.hammeredsoft.mailoff.util.MailOffConf.getConfig(MailOffConf.WEBROOT))) + (java.io.File.separator)) + "index.html"));
    java.awt.Desktop.getDesktop().browse(htmlFile.toURI());
}