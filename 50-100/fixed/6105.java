public void axisdrive(double x, double y, double r) {
    FL.set((((-y) + x) + r));
    FR.set(((y + x) + r));
    BL.set((((-y) - x) + r));
    BR.set(((y - x) + r));
}