public void getBalanceApdu() {
    try {
        javax.smartcardio.CommandAPDU capdu;
        capdu = new javax.smartcardio.CommandAPDU(apdugenerator.APDUGenerator.CLA_APPLET, apdugenerator.APDUGenerator.INS_BALANCE, ((byte) (0)), ((byte) (0)), ((byte) (0)));
        java.lang.System.out.println("APDU for Balance Op. :");
        java.lang.System.out.println(byteToStr(capdu.getBytes()));
    } catch (java.lang.Exception ex) {
        java.util.logging.Logger.getLogger(apdugenerator.APDUGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}