void draw(grabasilak.iti.www.myapplication.RenderingSettings rendering_settings, grabasilak.iti.www.myapplication.TextManager text_manager, java.util.ArrayList<grabasilak.iti.www.myapplication.Mesh> meshes, grabasilak.iti.www.myapplication.Camera camera) {
    if (m_is_animated) {
        m_is_animated = false;
        if (m_casts_shadows) {
            m_camera.computeViewMatrix();
            m_viewport.setViewport();
            m_shadow_mapping.draw(rendering_settings, text_manager, meshes, this, camera, 0);
        }
    }
}