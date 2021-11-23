static int calculateTotient(int n) {
    if ((euler69.Ideone.totients[n]) != 0) {
    }else
        if (!(euler69.Ideone.composite[n])) {
            euler69.Ideone.totients[n] = n - 1;
        }else {
            int product = n;
            for (java.lang.Integer prime : euler69.Ideone.primeFactors.get(n)) {
                product *= 1 - (1 / prime);
                java.lang.System.out.println(product);
            }
            euler69.Ideone.totients[n] = product;
        }
    
    return euler69.Ideone.totients[n];
}