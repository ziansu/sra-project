public static void setFOV(float fov) {
    main.java.VolatiliaOGL.settings.VideoSettings.FOV = fov;
    MasterRenderer.INSTANCE.createProjectionMatrix(main.java.VolatiliaOGL.settings.VideoSettings.FOV, main.java.VolatiliaOGL.settings.VideoSettings.FAR_PLANE, main.java.VolatiliaOGL.settings.VideoSettings.NEAR_PLANE);
}