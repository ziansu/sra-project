public com.badlogic.gdx.math.Matrix4 getEyeView(boolean limit) {
    if (needUpdate) {
        needUpdate = false;
        updateEyeView();
    }
    if (limit) {
        return this.eyeViewLimited;
    }else {
        return this.eyeView;
    }
}