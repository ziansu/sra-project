public void setLength(int min, int max) {
    assert min <= max;
    setMin(min);
    setMax(max);
    this.length = ((int) (((java.lang.Math.random()) * ((max - min) + 1)) + min));
}