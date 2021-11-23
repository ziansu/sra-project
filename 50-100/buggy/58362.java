public static double computeSqrt(double number) {
    double x = 0;
    double y = number;
    int iter = 35;
    while (iter > 0) {
        double t = (x + y) / 2;
        if ((t * t) == number)
            return t;
        else
            if ((t * t) > number)
                y = t;
            else
                x = t;
            
        
        iter--;
    } 
    return (x + y) / 2;
}