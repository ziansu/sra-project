public java.lang.String decrypt(java.lang.String encStr) {
    java.lang.String msg = "";
    if (encStr.contains("ag',r")) {
        encStr.replace("ag',r", "v");
    }
    if (encStr.contains("ssad")) {
        encStr.replace("ssad", "m");
    }
    if (encStr.contains("jeb..w")) {
        encStr.replace("jeb..w", "g");
    }
    if (encStr.contains("dug>?/")) {
        encStr.replace("dug>?/", "b");
    }
    return encStr;
}