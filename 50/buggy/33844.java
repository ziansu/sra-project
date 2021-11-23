protected java.lang.String GetUrl(java.lang.String DocName) {
    java.lang.String S = (getURL()) + DocName;
    S = S.replace("=", "%3D");
    S = S.replace("?", "%3F");
    return S;
}