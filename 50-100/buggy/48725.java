public foo.NullableCollectionFieldsBuilder numbers(java.lang.Iterable<? extends java.lang.Long> numbers) {
    if (numbers == null) {
        this.numbers = null;
        return this;
    }
    if (numbers instanceof foo.Collection) {
        return numbers(((foo.Collection<? extends java.lang.Long>) (numbers)));
    }
    return numbers(numbers.iterator());
}