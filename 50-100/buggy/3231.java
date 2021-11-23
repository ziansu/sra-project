@java.lang.Override
public final void initialize(@org.eclipse.jdt.annotation.Nullable
java.net.URL location, @org.eclipse.jdt.annotation.Nullable
java.util.ResourceBundle resources) {
    ourModel = initModel();
    if ((ourModel) != null) {
        adowrath.fx.model.Model.addLocaleListener(this::changed);
    }
    init(initRoot());
    delegatedInit(location, resources);
    if ((ourModel) != null) {
        if (isToTranslate()) {
            initLocalization();
        }else {
            java.lang.System.err.println(((toString()) + " is not to translate? Is this a working matter?"));
        }
    }
}