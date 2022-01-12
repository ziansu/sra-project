public void setOrientation(javax.vecmath.Quat4d orientation) {
    if ((this.orientation) == null)
        this.orientation = new javax.vecmath.Quat4d();
    
    this.orientation.set(orientation);
    us.ihmc.robotics.geometry.RotationTools.checkQuaternionNormalized(this.orientation);
}