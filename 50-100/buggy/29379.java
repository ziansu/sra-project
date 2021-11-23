static double birthday2(int n) {
    double value;
    int x = n;
    if (x > 1) {
        return 1 - (HR_Lab9_Practice.birthday((-n)));
    }else
        if (x == (-1)) {
            return 1;
        }else {
            value = ((365 + ((double) (x))) + 1) / 365;
            x++;
        }
    
    return value * (HR_Lab9_Practice.birthday(x));
}