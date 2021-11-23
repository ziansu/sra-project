private static long segmentToLong(java.lang.String[] segments) {
    long number = 0;
    int count = (segments.length) - 1;
    for (java.lang.String segment : segments) {
        android.util.Log.e(com.teocci.ytinbg.utils.Utils.TAG, "segment");
        number += (java.lang.Integer.parseInt(segment)) * (java.lang.Math.pow(10, (3 * (count--))));
    }
    return number;
}