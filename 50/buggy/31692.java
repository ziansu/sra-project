public void set(double time, javax.vecmath.Quat4d orientation, javax.vecmath.Vector3d angularVelocity) {
    setTime(time);
    this.orientation.set(orientation);
    this.angularVelocity.set(angularVelocity);
}