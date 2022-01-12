public static boolean isValidNumber(java.lang.String number) {
    if (null == number) {
        throw new java.lang.RuntimeException("Given number is null, please check again!");
    }else
        if (!(calculator.tools.CommonTool.isNumeric(number))) {
            throw new java.lang.RuntimeException("Given number is not a valid number, please check again!");
        }else {
            return true;
        }
    
}