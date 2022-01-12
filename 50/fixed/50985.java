com.fabdm.project.Vector2 getNormal(double t) {
    com.fabdm.project.Vector2 normalizedTangent = getNormalizedTangent(t);
    return com.fabdm.project.Vector2.create(normalizedTangent.y(), (-(normalizedTangent.x())));
}