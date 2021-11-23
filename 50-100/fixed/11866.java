public static java.lang.String random(int length) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    while ((builder.length()) < length) {
        builder.append(se.rupy.http.Event.BASE_58[java.lang.Math.abs(((se.rupy.http.Event.random.nextInt()) % (se.rupy.http.Event.BASE_58.length)))]);
    } 
    return builder.toString();
}