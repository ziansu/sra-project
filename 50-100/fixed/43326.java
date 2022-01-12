public com.badlogic.gdx.math.Vector3 calculateMedium(com.badlogic.gdx.math.Vector3 out) {
    out.set(position);
    if ((childs) == null)
        return out;
    
    for (com.mbrlabs.mundus.commons.scene3d.GameObject go : childs) {
        out.add(go.position);
    }
    return out.scl((1.0F / ((childs.size) + 1)));
}