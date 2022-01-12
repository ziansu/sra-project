public glMath.vectors.Vec3 getNormal(mesh.Geometry mesh) {
    glMath.vectors.Vec3 edge1 = glMath.VecUtil.subtract(mesh.getVertex(he2.sourceVert).getPos(), mesh.getVertex(he1.sourceVert).getPos());
    glMath.vectors.Vec3 edge2 = glMath.VecUtil.subtract(mesh.getVertex(he3.sourceVert).getPos(), mesh.getVertex(he1.sourceVert).getPos());
    return edge2.cross(edge1).normalize();
}