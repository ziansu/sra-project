public com.dg.jmge.model.Vector3D negate(com.dg.jmge.model.Vector3D vector) {
    com.dg.jmge.model.Vector3D output = multiplyByScalar(vector, (-1));
    return output;
}