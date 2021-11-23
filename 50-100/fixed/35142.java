public boolean checkPerfectNumber(int num) {
    if (num <= 1)
        return false;
    
    int ans = 0;
    for (long i = 1; (i * i) <= num; i++)
        if ((num % i) == 0) {
            if (i < num)
                ans += i;
            
            if ((i != (num / i)) && ((num / i) < num))
                ans += num / i;
            
        }
    
    return ans == num;
}