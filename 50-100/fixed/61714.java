static boolean setEncodingByUser(neoe.ne.PlainPage plainPage, java.lang.String msg) {
    java.lang.String s = javax.swing.JOptionPane.showInputDialog(plainPage.uiComp, msg, plainPage.pageData.encoding);
    if (s == null) {
        return false;
    }
    try {
        "a".getBytes(s);
    } catch (java.lang.Exception e) {
        plainPage.ui.message(("bad encoding:" + s));
        return false;
    }
    plainPage.pageData.encoding = s;
    return true;
}