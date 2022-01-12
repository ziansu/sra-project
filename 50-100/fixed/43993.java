static int binaryConvert(int n) {
    java.lang.String nums = java.lang.String.valueOf((n % 2));
    if (n == 1) {
        return 1;
    }else
        if (n == 0) {
            return 0;
        }else {
            java.lang.System.out.print(nums);
            return Exercise2.binaryConvert((n / 2));
        }
    
}