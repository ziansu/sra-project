public foo.CollectionFieldsBuilder numbers(foo.Iterator<? extends java.lang.Long> numbers) {
    if (numbers == null) {
        throw new java.lang.NullPointerException("numbers");
    }
    this.numbers = new java.util.HashSet<java.lang.Long>();
    while (numbers.hasNext()) {
        java.lang.Long item = numbers.next();
        if (item == null) {
            throw new java.lang.NullPointerException("numbers: null item");
        }
        this.numbers.add(item);
    } 
    return this;
}