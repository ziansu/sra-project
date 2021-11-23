@java.lang.Override
public void onChanged(javafx.collections.MapChangeListener.Change<? extends java.lang.Object, ? extends java.lang.Object> c) {
    java.lang.System.out.println("AUTOHIDE HAPPENED");
    if ((c.wasAdded()) && (com.sun.javafx.scene.control.skin.MenuButtonSkin.AUTOHIDE.equals(c.getKey()))) {
        menuButton.getProperties().remove(com.sun.javafx.scene.control.skin.MenuButtonSkin.AUTOHIDE);
        menu.hide();
    }
}