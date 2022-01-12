@java.lang.Override
public com.matrixpeckham.raytracer.util.Vector3D getDirection(com.matrixpeckham.raytracer.util.ShadeRec sr) {
    samplePoint.setTo(obj.sample());
    lightNormal.setTo(obj.getNormal(samplePoint));
    wi.setTo(samplePoint.sub(sr.hitPoint));
    wi.normalize();
    return wi;
}