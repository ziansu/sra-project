public static final com.samrj.devil.math.Mat4 scaling(float s) {
    com.samrj.devil.math.Mat4 m = new com.samrj.devil.math.Mat4();
    m.a = s;
    m.f = s;
    m.k = s;
    return m;
}