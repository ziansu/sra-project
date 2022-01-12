public java.lang.Object peek() {
    assert (size) > 0;
    return elements[((((tail) - 1) + (elements.length)) % (elements.length))];
}