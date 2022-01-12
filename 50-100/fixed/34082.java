static double calculateTotient(int n) {
    if ((euler69.Ideone.totients[n]) != 0) {
    }else
        if (!(euler69.Ideone.composite[n])) {
            euler69.Ideone.totients[n] = n - 1;
        }else {
            double product = n;
            for (java.lang.Integer prime : euler69.Ideone.primeFactors.get(n))
                product *= 1 - (((double) (1)) / prime);
            
            euler69.Ideone.totients[n] = product;
        }
    
    return euler69.Ideone.totients[n];
}