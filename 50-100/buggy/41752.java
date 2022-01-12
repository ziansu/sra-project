public void setUniform(final java.lang.String name, final int value) {
    int uniformID = uniformsMap.get(uniformsMap);
    if ((!(this.uniformsMap.containsKey(name))) || (uniformID <= 0)) {
        throw new java.lang.RuntimeException((("OpenGL Error: Cannot set value for uniform '" + name) + "', because uniform doesnt exists."));
    }
    glUniform1i(uniformID, value);
}