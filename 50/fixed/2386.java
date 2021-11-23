public void setUniform(java.lang.String uniformName, com.copetti.threeD.opengl.uniform.Uniform uniform) {
    int uniformId = glGetUniformLocation(shaderId, uniformName);
    uniform.getType().setUniform(uniformId, uniform.getValue());
}