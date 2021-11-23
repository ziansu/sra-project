static int binaryConvert(int n) {
    java.lang.String nums;
    java.lang.String result = "";
    java.lang.String reverse;
    nums = java.lang.String.valueOf((n % 2));
    result = result + nums;
    java.lang.System.out.print(result);
    if (n == 1) {
        return 1;
    }else
        if (n == 0) {
            return 0;
        }else {
            return Exercise2.binaryConvert((n / 2));
        }
    
}