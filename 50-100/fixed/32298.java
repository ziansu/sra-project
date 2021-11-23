public java.lang.String convertTime(java.lang.String time) {
    java.lang.String ampm = time.substring(((time.length()) - 2), time.length());
    time = time.substring(0, ((time.length()) - 2));
    int t = java.lang.Integer.parseInt(time);
    if (ampm.equals("pm")) {
        t += 12;
    }else
        if (t == 12) {
            t = 0;
        }
    
    return java.lang.Integer.toString(t);
}