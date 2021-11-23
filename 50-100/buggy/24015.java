public embla3d.engine.items.Item createItem(java.lang.String id, java.lang.Float[] pPosition, float pScale, embla3d.engine.meshs.Mesh pMesh) {
    if ((pPosition.length) != 3) {
        throw new java.lang.RuntimeException("Position must represent a 3D position because we live in a 3D world");
    }
    embla3d.engine.items.Item lItem = mNucleus.createItem(id, pPosition, pScale, pMesh);
    mSceneVertex.add(lItem);
    return lItem;
}