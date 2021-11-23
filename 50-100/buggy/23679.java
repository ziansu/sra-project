public void switchToLeftTask() {
    if (isReadyToPerformOperation()) {
        if ((taskPresenterList.size()) > 1) {
            int newTaskIndex = (currentPresenterIndex) - 1;
            if (newTaskIndex < 0) {
                newTaskIndex = (taskPresenterList.size()) - 1;
            }
            switchToTask(newTaskIndex);
        }
    }
}