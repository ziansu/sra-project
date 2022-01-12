private boolean isHappy(int n, java.util.Set<java.lang.Integer> appearedNums) {
    appearedNums.add(n);
    int squareSum = 0;
    while (n != 0) {
        squareSum += (n % 10) * (n % 10);
        n /= 10;
    } 
    if (squareSum == 1) {
        return true;
    }else
        if (appearedNums.contains(squareSum)) {
            return false;
        }else {
            return isHappy(squareSum, appearedNums);
        }
    
}