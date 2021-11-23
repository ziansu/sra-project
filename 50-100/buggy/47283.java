private void genMultiplicationQuestion() {
    int total = ((int) (java.lang.Math.pow(10, numDigits)));
    for (int i = 0; i < (numOperands); ++i) {
        operands.add(0, java.util.concurrent.ThreadLocalRandom.current().nextInt(0, total));
        if ((operands.get(0)) != 0)
            total /= operands.get(i);
        
        total = (total < 10) ? 10 : total;
    }
}