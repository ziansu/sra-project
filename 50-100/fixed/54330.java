@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    if ((event.getButton()) == (javafx.scene.input.MouseButton.PRIMARY)) {
        createDayView(start, end);
    }else
        if (((event.getButton()) == (javafx.scene.input.MouseButton.SECONDARY)) && (yearView)) {
            createYear(timeline.getStart(), timeline.getEnd());
        }
    
}