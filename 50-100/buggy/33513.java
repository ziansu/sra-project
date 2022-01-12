public void put_in_random_position(ThomsonSphere sphere) {
    this.point[0] = (java.lang.Math.random()) - 0.5;
    this.point[1] = (java.lang.Math.random()) - 0.5;
    this.point[2] = (java.lang.Math.random()) - 0.5;
    this.point = ThomsonPoint.normalizeVector(this.point);
}