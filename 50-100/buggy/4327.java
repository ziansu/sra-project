private static java.lang.String convertSymbolCharToFileName(char table, char index) {
    if (table == '/') {
        return "aprs_1_" + (java.lang.String.format("%02d", (index - '!')));
    }else
        if (table == '\\') {
            return "aprs_2_" + (java.lang.String.format("%02d", (index - '!')));
        }else {
            return "aprs_1_29";
        }
    
}