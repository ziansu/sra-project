@java.lang.Override
public com.bluenimble.apps.sdk.spec.ThemeSpec merge(com.bluenimble.apps.sdk.spec.ThemeSpec another) {
    if (!(another instanceof com.bluenimble.apps.sdk.ui.themes.impls.JsonThemeSpec)) {
        return this;
    }
    if ((spec) == null) {
        spec = ((com.bluenimble.apps.sdk.ui.themes.impls.JsonThemeSpec) (another)).spec;
        return this;
    }
    spec = spec.merge(((com.bluenimble.apps.sdk.ui.themes.impls.JsonThemeSpec) (another)).spec);
    return this;
}