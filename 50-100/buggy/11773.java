void ojld(int num1, int num2) {
    num1 = java.lang.Math.abs(num1);
    num2 = java.lang.Math.abs(num2);
    if (num2 > num1) {
        int temp = num2;
        num2 = num1;
        num1 = temp;
    }
    if (num2 == 0) {
        return ;
    }
    if ((num1 % num2) == 0) {
        this.maxcommom = num2;
        return ;
    }
    int temp = num1 % num2;
    ojld(num2, temp);
}