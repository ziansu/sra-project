@java.lang.Override
public java.lang.String toPath() {
    java.lang.String idLocal = getId();
    java.lang.String versionLocal = getVersion();
    java.lang.String typeLocal = getType();
    if (typeLocal.equals("nuspec")) {
        return java.lang.String.format("%s/%s/%s.%s", idLocal, versionLocal, idLocal, typeLocal);
    }
    return java.lang.String.format("%s/%s/%s.%s.%s", idLocal, versionLocal, idLocal, versionLocal, typeLocal);
}