public void writeHtml(java.lang.String htmlvalue1) {
    try {
        java.lang.String home_dir1;
        home_dir1 = oscar.OscarProperties.getInstance().getProperty("HOME_DIR");
        java.io.FileOutputStream out1 = new java.io.FileOutputStream((home_dir1 + (htmlFilename)));
        java.io.PrintStream p1 = new java.io.PrintStream(out1);
        p1.println(htmlvalue1);
        p1.close();
        out1.close();
    } catch (java.lang.Exception e) {
        oscar.oscarBilling.ca.on.data.JdbcBillingCreateBillingFile._logger.error("Write HTML File Error!!!", e);
    }
}