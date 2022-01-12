public void setUniforms(engine.rendering.Shader s) {
    s.setUniform("time", counter);
    s.setUniform("frequency", 5.0F);
    s.setUniform("amplitude", 0.01F);
}