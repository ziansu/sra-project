public static void main(java.lang.String[] args) {
    WatkinsInfo watkinsInfo = new WatkinsInfo();
    try {
        watkinsInfo.createPdf("watkins.pdf");
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}