private <T> boolean satisftyMFD(E attribute, T left, T right) {
    return (distance(left, right)) <= (this.mfd.getDelta());
}