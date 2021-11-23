private static void fillList(java.lang.String propertiesString, java.util.List<java.lang.Integer> target) {
    if (propertiesString != null) {
        java.lang.String[] strings = propertiesString.split(",");
        if (strings != null) {
            for (java.lang.String string : strings) {
                if ((string.length()) > 0)
                    target.add(java.lang.Integer.parseInt(string));
                
            }
        }
    }
}