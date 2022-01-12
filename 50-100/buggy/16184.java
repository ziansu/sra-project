private void createAttachementBuffer(com.nucleus.renderer.RenderTarget renderTarget, com.nucleus.renderer.RenderTarget.AttachementData attachementData) throws com.nucleus.opengl.GLException {
    switch (renderTarget.getTarget()) {
        case TEXTURE :
            attachementData.setTexture(createTexture(renderTarget, attachementData));
            break;
        default :
            throw new java.lang.IllegalArgumentException(("Not implemented for target:" + (renderTarget.getTargetName())));
    }
}