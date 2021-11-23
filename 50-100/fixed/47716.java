static double sumNumDouble(int times, double num) {
    double result = 0;
    for (int i = 0; i < times; i++) {
        result = result + num;
        if (num < (java.lang.Float.MAX_VALUE))
            java.lang.System.out.println(result);
        
    }
    return result;
}