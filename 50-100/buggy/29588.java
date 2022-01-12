static net.studymongolian.mongollibrary.MongolTextLine obtain() {
    net.studymongolian.mongollibrary.MongolTextLine tl;
    synchronized(net.studymongolian.mongollibrary.MongolTextLine.sCached) {
        for (int i = net.studymongolian.mongollibrary.MongolTextLine.sCached.length; (--i) >= 0;) {
            if ((net.studymongolian.mongollibrary.MongolTextLine.sCached[i]) != null) {
                tl = net.studymongolian.mongollibrary.MongolTextLine.sCached[i];
                net.studymongolian.mongollibrary.MongolTextLine.sCached[i] = null;
                return tl;
            }
        }
    }
    tl = new net.studymongolian.mongollibrary.MongolTextLine();
    if (net.studymongolian.mongollibrary.MongolTextLine.DEBUG) {
        android.util.Log.v("TLINE", ("new: " + tl));
    }
    return tl;
}