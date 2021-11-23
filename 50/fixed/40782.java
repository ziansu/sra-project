public foo.NullableCollectionFieldsBuilder numbers(java.lang.Long... numbers) {
    if (numbers == null) {
        this.numbers = null;
        return this;
    }
    return numbers(java.util.Arrays.asList(numbers));
}