public Assignment1.Vectors add(Assignment1.Vectors v) {
    Assignment1.Vectors addedVector = new Assignment1.Vectors(((v.getX()) + (this.getX())), (this.y = (v.getY()) + (this.getY())), (this.z = (v.getZ()) + (this.getZ())));
    return addedVector;
}