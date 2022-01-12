public static java.lang.String random(int length) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    do {
        while ((builder.length()) < length) {
            builder.append(se.rupy.http.Event.BASE_58[java.lang.Math.abs(((se.rupy.http.Event.random.nextInt()) % (se.rupy.http.Event.BASE_58.length)))]);
        } 
    } while (builder.toString().matches("[0-9]+") );
    return builder.toString();
}