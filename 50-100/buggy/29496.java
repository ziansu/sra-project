public javalearn.Complex add(javalearn.Complex other) {
    if (other == null) {
        other = new javalearn.Complex(0, 0);
    }
    javalearn.Complex result = new javalearn.Complex(((this.real) + (other.real)), ((this.image) + (other.image)));
    return result;
}