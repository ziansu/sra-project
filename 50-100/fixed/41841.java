private void generatePrimesUpTo(long n) {
    this.init();
    while ((this.primes.get(((this.primes.size()) - 1))) < n) {
        this.generateNext();
    } 
    this.primes.remove(((this.primes.size()) - 1));
}