public static void main(java.lang.String[] args) {
    if (java.util.Arrays.asList(args).contains(Variables.VERBOSE_FLAG)) {
        com.sysc.tftp.utils.Variables.VERBOSE = true;
    }
    com.sysc.tftp.error.ErrorSimulator es = new com.sysc.tftp.error.ErrorSimulator();
    es.start();
}