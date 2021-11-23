public foo.NullableCollectionFieldsBuilder numbers(foo.Iterator<? extends java.lang.Long> numbers) {
    if (numbers == null) {
        this.numbers = null;
        return this;
    }
    this.numbers = new java.util.HashSet<java.lang.Long>();
    while (numbers.hasNext()) {
        java.lang.Long item = numbers.next();
        this.numbers.add(item);
    } 
    return this;
}