@java.lang.Override
public void handle(javafx.event.ActionEvent a) {
    java.lang.String name = AddLayerPopup.display();
    if (!(name.isEmpty())) {
        makeNewLayer(name);
    }
}