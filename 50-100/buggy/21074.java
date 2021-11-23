public static java.lang.String BuildQueryParams(java.lang.String[][] jsonTerms) {
    java.lang.String str = "";
    for (int i = 0; i < (jsonTerms.length); i++) {
        if (i == 0) {
            str += "?";
        }else {
            str += "&";
        }
        str += java.net.URLEncoder.encode(jsonTerms[i][0]);
        str += "=";
        str += java.net.URLEncoder.encode(jsonTerms[i][1]);
    }
    return str;
}