public static final void baryPoint(com.samrj.devil.math.Vec3 a, com.samrj.devil.math.Vec3 b, com.samrj.devil.math.Vec3 c, com.samrj.devil.math.Vec3 bary, com.samrj.devil.math.Vec3 r) {
    com.samrj.devil.math.Vec3.mult(a, bary.x, r);
    r.madd(b, bary.y);
    r.madd(b, bary.z);
}