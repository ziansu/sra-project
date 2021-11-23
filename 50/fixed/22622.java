@java.lang.Override
public void handle(javafx.scene.input.MouseEvent arg0) {
    for (int i = 0; i < 6; i += 1) {
        if ((others[i]) != null)
            others[i].setFill(javafx.scene.paint.Color.ALICEBLUE);
        
    }
}