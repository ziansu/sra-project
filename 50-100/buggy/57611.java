public float dotRow(com.ymatou.atc.fastText4j.Vector vec, int i) {
    assert i >= 0;
    assert i < (m);
    assert (vec.getM()) == (n);
    float d = 0.0F;
    for (int j = 0; j < (n); j++) {
        d += (data[((i * (n)) + j)]) * (vec.get(i));
    }
    return d;
}