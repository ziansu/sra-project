public org.joml.Matrix4f getMatrix() {
    if ((p_changed) || (v_changed)) {
        if (p_changed)
            makeProjectionMatrix();
        
        if (v_changed)
            makeViewMatrix();
        
        p_matrix.mul(v_matrix, matrix);
        logOut("Camera Matrix:", matrix);
    }
    return matrix;
}