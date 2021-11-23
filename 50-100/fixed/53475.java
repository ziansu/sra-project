public static boolean isValidNumber(java.lang.String number) {
    if (null == number) {
        java.lang.System.out.println("Given number is null, please check again!");
        throw new java.lang.RuntimeException("Given number is null, please check again!");
    }else
        if (!(calculator.tools.CommonTool.isNumeric(number))) {
            java.lang.System.out.println("Given number is not a valid number, please check again!");
            throw new java.lang.RuntimeException("Given number is not a valid number, please check again!");
        }else {
            return true;
        }
    
}