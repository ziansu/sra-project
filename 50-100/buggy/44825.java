static java.lang.String[] parseGetOptions(java.lang.String query) {
    if (query != null) {
        java.lang.String[] args = query.split("&");
        for (java.lang.String arg : args) {
            java.lang.String[] argEntry = arg.split("=");
            if (argEntry[0].equals("fields")) {
                return argEntry[1].split(",");
            }
        }
    }
    return null;
}