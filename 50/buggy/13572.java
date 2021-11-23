@java.lang.Override
public double G(com.matrixpeckham.raytracer.util.ShadeRec sr) {
    double ndotd = lightNormal.neg().dot(wi);
    double d2 = samplePoint.distSquared(sr.hitPoint);
    return ndotd / d2;
}