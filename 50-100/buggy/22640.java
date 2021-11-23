public static final void main(java.lang.String[] args) {
    int rc = 0;
    ca.magenta.krr.KRR.logger.info("");
    ca.magenta.krr.KRR.logger.info(("Running KRR version " + (ca.magenta.krr.KRR.VERSION)));
    ca.magenta.krr.KRR.logger.info(("PWD: " + (java.lang.System.getProperty("user.dir"))));
    ca.magenta.krr.KRR.KRRProps paramOptions = ca.magenta.krr.KRR.parseParam(args);
    if (rc == 0) {
        ca.magenta.krr.KRR krr = new ca.magenta.krr.KRR(paramOptions);
        krr.run();
    }
}