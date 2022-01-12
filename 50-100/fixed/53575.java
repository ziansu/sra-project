public void previousWrong() {
    java.lang.System.out.println("CALL: previousWrong() from InterfaceBean");
    long starTime = java.lang.System.nanoTime();
    try {
        listOfPhrases.get(((index) - 1)).wrongAnswer(null);
        resultProcessing();
    } catch (java.lang.NullPointerException e) {
        java.lang.System.out.println("EXCEPTION: in previousWrong() from InterfaceBean");
        e.printStackTrace();
    }
    avgTimeOfAccsToDb = new java.math.BigDecimal(((java.lang.System.nanoTime()) - starTime)).divide(new java.math.BigDecimal(1000000)).setScale(2, java.math.RoundingMode.HALF_UP);
}