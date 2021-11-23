public double getGravity() {
    if ((otherPlayer) == null) {
        return incSpeed ? 20 : (gravity) / 256.0;
    }else {
        return incSpeed ? 20 : 1.0 / (gravity);
    }
}