private static java.math.BigInteger getValue(java.lang.String s) {
    s.replace(":", "");
    java.lang.String res = "";
    for (int i = 0; i < (s.length()); i++) {
        res += ((int) (s.charAt(i)));
    }
    org.cocos2dx.cpp.DebugManager.print(((("s/v = " + s) + " ") + res), WifiDirectManager.DEBUGGER_CHANNEL);
    return new java.math.BigInteger(res);
}