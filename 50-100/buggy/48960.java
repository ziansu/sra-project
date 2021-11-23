public static java.lang.String toString(java.lang.CharSequence[] list, java.lang.String separator) {
    if ((list.length) == 0) {
        return "";
    }else {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.CharSequence str : list) {
            sb.append((separator + str));
        }
        return sb.deleteCharAt(0).toString();
    }
}