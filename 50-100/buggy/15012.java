private static java.lang.String mozillaJCharDet(byte[] bytes) {
    org.mozilla.intl.chardet.nsDetector det = new org.mozilla.intl.chardet.nsDetector(org.mozilla.intl.chardet.nsDetector.ALL);
    det.DoIt(bytes, bytes.length, false);
    det.DataEnd();
    det.Reset();
    return det.getProbableCharsets()[0];
}