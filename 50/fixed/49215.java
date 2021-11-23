public org.c1.maths.Mat4f set(int x, int y, float val) {
    data[(y + (x * 4))] = val;
    return this;
}