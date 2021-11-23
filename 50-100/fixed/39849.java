public Assignment1.Vectors add(Assignment1.Vectors v) {
    Assignment1.Vectors addedVector = new Assignment1.Vectors(((v.getX()) + (this.getX())), ((v.getY()) + (this.getY())), ((v.getZ()) + (this.getZ())));
    return addedVector;
}