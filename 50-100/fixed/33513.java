public void put_in_random_position() {
    java.lang.System.out.println(((java.lang.Math.random()) - 0.5));
    this.point[0] = (java.lang.Math.random()) - 0.5;
    this.point[1] = (java.lang.Math.random()) - 0.5;
    this.point[2] = (java.lang.Math.random()) - 0.5;
    this.point = ThomsonPoint.normalizeVector(this.point);
}