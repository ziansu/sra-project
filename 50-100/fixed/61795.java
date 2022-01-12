@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends javafx.scene.control.Toggle> ov, javafx.scene.control.Toggle toggle, javafx.scene.control.Toggle new_toggle) {
    if (new_toggle == null) {
        isTimedOn = false;
        showTimed.getStyleClass().removeAll();
    }else {
        isTimedOn = true;
        showTimed.getStyleClass().removeAll();
    }
    createDisplayTaskList();
    setTaskList(DisplayTaskList);
}