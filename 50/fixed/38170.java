public int additionFactorial(int number) {
    if (number <= 1) {
        return 1;
    }else {
        return number + (additionFactorial((number - 1)));
    }
}