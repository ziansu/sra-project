public static void dbgOut(java.lang.String s, int mLevel) {
    if (((utility.Util.debugLevel) > 0) && ((utility.Util.debugLevel) >= mLevel)) {
        java.lang.System.out.println((((((utility.Util.printTime()) + " (DBG|") + (java.lang.Integer.toString(utility.Util.debugLevel))) + ") ") + s));
    }
}