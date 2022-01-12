public processing.core.PVector coerceVectorToAxis(processing.core.PVector vect) {
    processing.core.PVector a = vect.normalize();
    do {
        a.x = ((a.x) < 0.5F) ? 0.0F : 1.0F;
        a.y = ((a.y) < 0.5F) ? 0.0F : 1.0F;
        a.z = ((a.z) < 0.5F) ? 0.0F : 1.0F;
    } while (!(a.equals(a.normalize())) );
    return a;
}