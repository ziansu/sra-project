static double birthday2(int n) {
    if (n > 0) {
        return 1 - (HR_Lab9_Practice.birthday2((-n)));
    }else
        if (n == (-1)) {
            return 1;
        }else {
            return (((365 + ((double) (n))) + 1) / 365) * (HR_Lab9_Practice.birthday2((n + 1)));
        }
    
}