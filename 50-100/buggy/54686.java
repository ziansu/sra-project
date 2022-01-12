public java.lang.String encode(long... numbers) {
    for (long number : numbers) {
        if (number > (org.hashids.Hashids.MAX_NUMBER)) {
            throw new java.lang.IllegalArgumentException((("number can not be greater than " + (org.hashids.Hashids.MAX_NUMBER)) + "L"));
        }
    }
    if ((numbers.length) == 0) {
        return "";
    }
    return this._encode(numbers);
}