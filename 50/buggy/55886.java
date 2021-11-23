private void updateUniforms() {
    program.uniform("model", modelMatrix);
    program.uniform("view", viewMatrix);
    program.uniform("projection", projectionMatrix);
    program.uniform("time", time);
}