public static java.lang.Object parseLiteral(java.lang.String s) {
    switch (s) {
        case "true" :
            return true;
        case "false" :
            return false;
        case "null" :
            return null;
        default :
            try {
                return java.lang.Long.parseLong(s);
            } catch (java.lang.NumberFormatException e1) {
                try {
                    return java.lang.Double.parseDouble(s);
                } catch (java.lang.NumberFormatException e2) {
                    return org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(s);
                }
            }
    }
}