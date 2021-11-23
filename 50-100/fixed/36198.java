public Matrix inverse() {
    if (!(square)) {
        return null;
    }else {
        double d = det();
        if (d == 0) {
            return null;
        }else {
            return MoC().tr().scale((1.0 / (det())));
        }
    }
}