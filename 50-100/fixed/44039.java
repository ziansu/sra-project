public final boolean isGLES2() {
    if (0 != ((ctxOptions) & (com.jogamp.opengl.GLContext.CTX_PROFILE_ES))) {
        final int major = ctxVersion.getMajor();
        return (2 == major) || (3 == major);
    }else {
        return false;
    }
}