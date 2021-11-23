public static java.lang.String m2s(java.util.Map map) {
    if (com.arialyy.frame.util.show.L.isDebug) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Set set = map.entrySet();
        for (java.lang.Object aSet : set) {
            java.util.Map.Entry entry = ((java.util.Map.Entry) (aSet));
            sb.append(entry.getValue());
        }
        return sb.toString();
    }
    return "";
}