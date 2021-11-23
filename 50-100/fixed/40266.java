private void initRenderers() {
    com.dersgames.engine.graphics.RenderEngine.m_TerrainRenderer = new com.dersgames.engine.graphics.TerrainRenderer();
    com.dersgames.engine.graphics.RenderEngine.m_EntityRenderer = new com.dersgames.engine.graphics.EntityRenderer();
    com.dersgames.engine.graphics.RenderEngine.m_NormalMapRenderer = new com.dersgames.engine.graphics.NormalMapRenderer();
    com.dersgames.engine.graphics.RenderEngine.m_SkyboxRenderer = new com.dersgames.engine.graphics.SkyboxRenderer();
    com.dersgames.engine.graphics.RenderEngine.m_WaterRenderer = new com.dersgames.engine.graphics.WaterRenderer();
    com.dersgames.engine.graphics.RenderEngine.m_GUIRenderer = new com.dersgames.engine.graphics.GUIRenderer();
    com.dersgames.engine.graphics.RenderEngine.m_PostProcessRenderer = new com.dersgames.engine.graphics.renderers.postprocessing.PostProcessRenderer();
    m_Renderers = new java.util.ArrayList<>();
    m_Renderers.add(com.dersgames.engine.graphics.RenderEngine.m_EntityRenderer);
    m_Renderers.add(com.dersgames.engine.graphics.RenderEngine.m_NormalMapRenderer);
    m_Renderers.add(com.dersgames.engine.graphics.RenderEngine.m_TerrainRenderer);
    m_Renderers.add(com.dersgames.engine.graphics.RenderEngine.m_SkyboxRenderer);
}