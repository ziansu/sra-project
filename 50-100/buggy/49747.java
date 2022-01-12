public void setMesh(org.gearvrf.GVRMesh mesh) {
    org.gearvrf.GVRMesh oldMesh = mMesh;
    synchronized(this) {
        mMesh = mesh;
        mFutureMesh = null;
        for (org.gearvrf.GVRRenderPass pass : mRenderPassList) {
            pass.setMesh(mesh);
        }
    }
    org.gearvrf.NativeRenderData.setMesh(getNative(), mesh.getNative());
    if (oldMesh != null) {
        bindShader(getGVRContext().getMainScene());
    }
}