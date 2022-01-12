@org.develnext.jphp.ext.javafx.classes.Getter
public javafx.scene.layout.Pane getLayout(php.runtime.env.Environment env) {
    php.runtime.Memory data = data("~~virtual-layout");
    if (data.isNotNull()) {
        return ((javafx.scene.layout.Pane) (php.runtime.Memory.unwrap(env, data)));
    }
    return (getWrappedObject().getScene()) == null ? null : ((javafx.scene.layout.Pane) (getWrappedObject().getScene().getRoot()));
}