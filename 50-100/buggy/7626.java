public java.lang.String newAccountNumber() {
    java.lang.String newAccountNum = java.lang.Integer.toString(java.util.concurrent.ThreadLocalRandom.current().nextInt(100000, 999999));
    java.io.File f = new java.io.File((newAccountNum + ".csv"));
    if (f.exists()) {
        newAccountNumber();
    }
    return newAccountNum;
}