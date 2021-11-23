public int random(Random rand, int num1, int num2) {
    return (num1 - 1) + ((int) (java.lang.Math.ceil(((rand.nextDouble()) * ((num2 - num1) + 1)))));
}