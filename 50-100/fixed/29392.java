public static java.lang.String remove1(java.lang.String input) {
    java.lang.String original = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
    java.lang.String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
    java.lang.String output = input;
    for (int i = 0; i < (original.length()); i++) {
        output = output.replace(original.charAt(i), ascii.charAt(i));
    }
    return output;
}