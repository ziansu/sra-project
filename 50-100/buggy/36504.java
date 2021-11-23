public static void main(java.lang.String[] args) {
    try {
        com.lftechnology.java.training.alina.basic.SumOfEvenFibonacci fibonacci = new com.lftechnology.java.training.alina.basic.SumOfEvenFibonacci(0, 1);
        com.lftechnology.java.training.alina.basic.EvenFibonacci.LOGGER.info(("The sum of the even-valued fibonacci terms : " + (fibonacci.getSumOfEvenFibonacci())));
    } catch (java.lang.ArithmeticException ex) {
        com.lftechnology.java.training.alina.basic.EvenFibonacci.LOGGER.warning(("Exception : " + (ex.getMessage())));
    }
}