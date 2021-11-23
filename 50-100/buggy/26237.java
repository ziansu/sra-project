public static java.lang.String remove1(java.lang.String input) {
    java.lang.String original = "Ã¡Ã Ã¤Ã©Ã¨Ã«Ã­Ã¬Ã¯Ã³Ã²Ã¶ÃºÃ¹uÃ±Ã�Ã€Ã„Ã‰ÃˆÃ‹Ã�ÃŒÃ�Ã“Ã’Ã–ÃšÃ™ÃœÃ‘Ã§Ã‡";
    java.lang.String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
    java.lang.String output = input;
    for (int i = 0; i < (original.length()); i++) {
        output = output.replace(original.charAt(i), ascii.charAt(i));
    }
    return output;
}