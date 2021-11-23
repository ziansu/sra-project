public static void main(java.lang.String[] args) {
    int i = 10;
    int tot = 0;
    int count = 0;
    while (count <= 11) {
        if (ProjectEuler.Problem37.checkForTruncatablePrime(i)) {
            tot += i;
            count++;
        }
        i++;
    } 
    java.lang.System.out.println(tot);
}