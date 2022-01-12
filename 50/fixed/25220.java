public void end() {
    if (gl.active())
        gl.active(false);
    
    if ((scene) != null)
        scene.end();
    
}