private static cs155.core.Color3D calculateDiffuse(cs155.core.Point3D n, cs155.core.Color3D matColor, cs155.core.Color3D lightColor, cs155.core.Point3D lightVec) {
    cs155.core.Color3D localDiffuse;
    double diffuseIntensity = cs155.core.Light3D.diffuse(lightVec, n);
    matColor = Color3D.WHITE;
    localDiffuse = matColor.times(lightColor).scale(diffuseIntensity);
    return localDiffuse;
}