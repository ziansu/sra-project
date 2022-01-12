private void updateUniforms() {
    program.uniform("model", modelMatrix);
    program.uniform("time", time);
}