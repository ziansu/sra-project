@org.develnext.jphp.ext.javafx.classes.Signature
public void show() {
    fixResizeBug();
    getWrappedObject().show();
    fixResizeBug();
}