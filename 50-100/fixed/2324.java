public static void main(java.lang.String[] args) {
    if (((args.length) == 1) && ("--version".equals(args[0]))) {
        java.lang.System.out.println(ph.kana.csvv.util.Constants.APP_NAME);
        java.lang.System.out.println(ph.kana.csvv.util.Constants.VERSION);
        java.lang.System.exit(0);
    }else {
        javafx.application.Application.launch(args);
    }
}