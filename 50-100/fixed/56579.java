@java.lang.Override
public void dispose() {
    com.badlogic.gdx.graphics.GL20 gl = com.badlogic.gdx.Gdx.gl20;
    disposeColorTexture(colorTexture);
    if (hasDepthStencilPackedBuffer) {
        gl.glDeleteRenderbuffer(depthStencilPackedBufferHandle);
    }else {
        if (hasDepth)
            gl.glDeleteRenderbuffer(depthbufferHandle);
        
        if (hasStencil)
            gl.glDeleteRenderbuffer(stencilbufferHandle);
        
    }
    gl.glDeleteFramebuffer(framebufferHandle);
    if ((com.badlogic.gdx.graphics.glutils.GLFrameBuffer.buffers.get(Gdx.app)) != null)
        com.badlogic.gdx.graphics.glutils.GLFrameBuffer.buffers.get(Gdx.app).removeValue(this, true);
    
}