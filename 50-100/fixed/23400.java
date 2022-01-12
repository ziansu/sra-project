@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((o != null) && (o instanceof raytracer.Object3D)) {
        return (((((raytracer.Object3D) (o)).x) == (x)) && ((((raytracer.Object3D) (o)).y) == (y))) && ((((raytracer.Object3D) (o)).z) == (z));
    }
    return false;
}