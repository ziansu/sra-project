public static void main(java.lang.String[] args) {
    java.lang.String code = ((args.length) > 0) ? args[0] : null;
    if ("+".equals(code)) {
        BurrowsWheeler.encode();
    }else
        if ("-".equals(code)) {
            BurrowsWheeler.decode();
        }else {
            java.lang.System.out.println("Usage: java BurrowsWheeler (+|-) < filename");
        }
    
}