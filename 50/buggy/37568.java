@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    if ((confirmListener) != null)
        confirmListener.perform();
    
    tableOrder.refresh();
}