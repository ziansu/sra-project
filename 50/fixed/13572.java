@java.lang.Override
public double G(com.matrixpeckham.raytracer.util.ShadeRec sr) {
    double ndotd = lightNormal.get().neg().dot(wi.get());
    double d2 = samplePoint.get().distSquared(sr.hitPoint);
    return ndotd / d2;
}