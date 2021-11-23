public void end() {
    if (gl.active()) {
        gl.active(false);
    }
    scene.end();
}