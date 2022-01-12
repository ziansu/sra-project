public int compare(com.ct.girls.model.Girl arg0, com.ct.girls.model.Girl arg1) {
    java.lang.Integer W0 = new java.lang.Integer(arg0.getBWH().split(" ")[1].substring(1));
    java.lang.Integer W1 = new java.lang.Integer(arg1.getBWH().split(" ")[1].substring(1));
    return W0.compareTo(W1);
}