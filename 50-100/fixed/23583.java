private long sumOfAllMultiples(int maximum, int factor1, int factor2) {
    long sum = 0;
    while (maximum > 0) {
        if (utils.MathUtil.isMultiple(maximum, factor1)) {
            sum += maximum;
        }else
            if (utils.MathUtil.isMultiple(maximum, factor2)) {
                sum += maximum;
            }
        
        maximum--;
    } 
    return sum;
}