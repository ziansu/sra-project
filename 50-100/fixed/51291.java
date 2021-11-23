@org.develnext.jphp.ext.javafx.classes.Setter
public void setLayout(php.runtime.env.Environment env, javafx.scene.layout.Pane pane) {
    if ((getWrappedObject().getScene()) == null) {
        throw new java.lang.IllegalStateException("Unable to set layout");
    }
    getWrappedObject().getScene().setRoot(pane);
    getWrappedObject().sizeToScene();
    data(env, "~~virtual-layout", Memory.NULL);
}