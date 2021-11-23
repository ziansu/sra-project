public com.badlogic.gdx.math.Vector3 calculateMedium(com.badlogic.gdx.math.Vector3 out) {
    transform.getTranslation(out);
    if ((childs) == null)
        return out;
    
    for (com.mbrlabs.mundus.commons.scene3d.GameObject go : childs) {
        go.transform.getTranslation(com.mbrlabs.mundus.commons.scene3d.GameObject.tempVec0);
        out.add(com.mbrlabs.mundus.commons.scene3d.GameObject.tempVec0);
    }
    return out.scl((1.0F / ((childs.size) + 1)));
}