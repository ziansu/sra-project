private static java.lang.Boolean ReadVerifyStoreDumpPage(net.basov.nfc.NFCaDump dump, java.lang.String line) {
    java.lang.Boolean rc = false;
    if ((line.matches("-?[0-9a-fA-F]+")) && ((line.length()) == 8)) {
        dump.addPage(net.basov.util.FileIO.hexStringToByteArray(line));
        rc = true;
    }else {
        dump.appendRemark((("E: :" + line) + ":\n"));
        rc = false;
    }
    return rc;
}