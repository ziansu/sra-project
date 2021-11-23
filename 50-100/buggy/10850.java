@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    if ((event.getSource()) instanceof javafx.scene.control.ComboBox) {
        java.lang.Integer bassTrack;
        bassTrack = ((javafx.scene.control.ComboBox<java.lang.Integer>) (event.getSource())).getValue();
        ui.Slave.setBassTrack(bassTrack);
    }
}