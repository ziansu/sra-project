public static void main(java.lang.String[] args) {
    gr.grnet.escience.commons.Utils util = new gr.grnet.escience.commons.Utils();
    java.lang.String out = null;
    java.lang.String hashAlgo = "SHA-256";
    try {
        out = util.computeHash("Lorem ipsum dolor sit amet.", hashAlgo);
    } catch (java.security.NoSuchAlgorithmException e) {
        util.dbgPrint(("invalid hash algorithm:" + hashAlgo), e);
    } catch (java.io.UnsupportedEncodingException e) {
        util.dbgPrint("invalid encoding", e);
    }
    util.dbgPrint("Pithos FileSystem Connector loaded.");
    util.dbgPrint("Hash Test:", out);
}