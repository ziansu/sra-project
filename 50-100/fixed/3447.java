@java.lang.Override
public com.matrixpeckham.raytracer.util.Vector3D getDirection(com.matrixpeckham.raytracer.util.ShadeRec sr) {
    samplePoint.get().setTo(obj.sample());
    lightNormal.get().setTo(obj.getNormal(samplePoint.get()));
    wi.get().setTo(samplePoint.get().sub(sr.hitPoint));
    wi.get().normalize();
    return wi.get();
}