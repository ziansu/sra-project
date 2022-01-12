public static void setSpotLight(com.base.engine.SpotLight[] spotLights) {
    if ((spotLights.length) > (com.base.engine.LightingShader.MAX_SPOT_LIGHTS)) {
        java.lang.System.err.println(("Too many spot lights. Max allowed is " + (com.base.engine.LightingShader.MAX_SPOT_LIGHTS)));
        new java.lang.Exception().printStackTrace();
        java.lang.System.exit(1);
    }
    com.base.engine.LightingShader.spotLights = spotLights;
}