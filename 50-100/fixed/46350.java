private static java.util.List<java.lang.Integer> generateRecheneinheiten(java.lang.String rechenEinheitenString) {
    java.util.List<java.lang.Integer> list = new java.util.ArrayList<>();
    if ((rechenEinheitenString.length()) > 0) {
        for (java.lang.String s : rechenEinheitenString.split(",")) {
            list.add(java.lang.Integer.parseInt(s));
        }
    }
    return list;
}