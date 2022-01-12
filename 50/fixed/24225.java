public void render(org.rajawali3d.cameras.Camera camera, final org.rajawali3d.math.Matrix4 vpMatrix, final org.rajawali3d.math.Matrix4 projMatrix, final org.rajawali3d.math.Matrix4 vMatrix, org.rajawali3d.materials.Material sceneMaterial) {
    render(camera, vpMatrix, projMatrix, vMatrix, null, sceneMaterial, false);
}