public mekanism.api.Pos3D translate(double x, double y, double z) {
    return new mekanism.api.Pos3D(((this.x) + x), ((this.y) + y), ((this.z) + z));
}