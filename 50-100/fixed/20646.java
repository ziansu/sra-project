public static void main(java.lang.String[] args) {
    Helpers.Seed seed = new Helpers.Seed(1000000);
    int n = 0;
    int number = 4;
    while (n != 4) {
        if ((Problem47.numberOfFactors(number, seed.getPrimes_list())) >= 4) {
            n++;
        }else {
            n = 0;
        }
        number++;
    } 
    java.lang.System.out.println(number);
}