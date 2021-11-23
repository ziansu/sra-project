@java.lang.Override
public final void setSkin(javafx.scene.control.Skin<?> value) {
    skinProperty().setValue(value);
    skinClassNameProperty().set(currentSkinClassName);
}