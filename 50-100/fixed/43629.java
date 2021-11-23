@java.lang.Override
public final void initShaders() {
    compileShadersProgram();
    shaderProgram = glCreateProgram();
    glAttachShader(vertShader);
    glAttachShader(fragShader);
    glBindAttribLocation(org.geogebra.common.geogebra3D.euclidian3D.openGL.RendererImplShaders.GLSL_ATTRIB_POSITION, "attribute_Position");
    glBindAttribLocation(org.geogebra.common.geogebra3D.euclidian3D.openGL.RendererImplShaders.GLSL_ATTRIB_NORMAL, "attribute_Normal");
    glBindAttribLocation(org.geogebra.common.geogebra3D.euclidian3D.openGL.RendererImplShaders.GLSL_ATTRIB_COLOR, "attribute_Color");
    glBindAttribLocation(org.geogebra.common.geogebra3D.euclidian3D.openGL.RendererImplShaders.GLSL_ATTRIB_TEXTURE, "attribute_Texture");
    glLinkProgram();
    setShaderLocations();
    createVBOs();
    attribPointers();
}