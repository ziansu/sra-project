public java.lang.Object peek() {
    return elements[((((tail) - 1) + (elements.length)) % (elements.length))];
}