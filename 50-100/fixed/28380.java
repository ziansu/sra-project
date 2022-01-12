public java.math.BigInteger arrayFibonacci(int n) {
    if (n < 2) {
        return this.arrayList.get(n);
    }else {
        this.arrayList.add(this.arrayList.get((n - 1)).add(this.arrayList.get((n - 2))));
        return this.arrayList.get(n);
    }
}