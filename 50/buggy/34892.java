@java.lang.Override
protected void controlUpdate(float tpf) {
    correctZAxis();
    spatial.rotate(0, 0, ((speed) * tpf));
}