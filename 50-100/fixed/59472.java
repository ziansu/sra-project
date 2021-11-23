public void DivisionLevel1() {
    question = "";
    correct = false;
    java.util.Random random = new java.util.Random();
    number1 = (java.lang.Math.abs(random.nextInt(10))) + (1 * 10);
    number2 = (number1) / 2;
    question = (((number1) + " ÷ ") + (number2)) + " = ?";
    answer = (number1) / (number2);
}