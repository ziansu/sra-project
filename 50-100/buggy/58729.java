public static void main(java.lang.String[] args) {
    try {
        com.lftechnology.java.training.sanish.sumnumber.Main.LOGGER.info(("Sum sum multiples of 3 or 5 below 1000 : " + ((com.lftechnology.java.training.sanish.sumnumber.SumMultiples.getMultiples(3, 999)) + (com.lftechnology.java.training.sanish.sumnumber.SumMultiples.getMultiples(5, 999)))));
    } catch (java.lang.ArithmeticException e) {
        com.lftechnology.java.training.sanish.sumnumber.Main.LOGGER.warning(("Exception : " + (e.getMessage())));
    }
}