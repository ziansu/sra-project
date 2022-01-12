@java.lang.Override
public void postQueue(com.jme3.renderer.queue.RenderQueue renderQueue) {
    DeferredRenderManager.renderOpaqueQueue(gBuffer, renderManager, viewPort, renderQueue);
    lightManager.render(gBuffer, renderManager, viewPort);
    postDeferredManager.render(gBuffer, renderManager, viewPort, renderQueue);
    postDeferredManager.renderSkyQueue(renderManager, viewPort, renderQueue);
    postDeferredManager.renderTranslucentQueue(renderManager, viewPort, renderQueue);
    postDeferredManager.renderDebug(gBuffer, renderManager);
    lightManager.renderDebug(gBuffer, renderManager);
    postDeferredManager.drawFrameOnScreen(gBuffer, renderManager);
}