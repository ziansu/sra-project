public static void main(java.lang.String[] args) throws java.io.IOException {
    long start = java.lang.System.currentTimeMillis();
    java.lang.System.out.println("RUNNING");
    eu.mihosoft.vrl.v3d.FileUtil.write(java.nio.file.Paths.get("servo-head-female.stl"), new eu.mihosoft.vrl.v3d.samples.ServoHead().servoHeadFemale().toStlString());
    eu.mihosoft.vrl.v3d.FileUtil.write(java.nio.file.Paths.get("servo-head-male.stl"), new eu.mihosoft.vrl.v3d.samples.ServoHead().servoHeadMale().toStlString());
    long stop = java.lang.System.currentTimeMillis();
    java.lang.System.out.println((stop - start));
}