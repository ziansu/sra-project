public java.lang.String getVersion() {
    com.markusfeng.Shared.Version[] versions = com.markusfeng.logicgame.LogicGame.class.getAnnotationsByType(com.markusfeng.Shared.Version.class);
    if ((versions.length) != 1) {
        throw new java.lang.UnsupportedOperationException("No valid version found");
    }
    java.lang.System.out.println(versions[0].value());
    return versions[0].value();
}