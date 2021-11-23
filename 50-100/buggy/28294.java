public void saveSprint() {
    softwaremanagementtool.agile.Sprint sprint = classController.getSelectedItem();
    if (sprint != null) {
        infoViewController.saveSprint(sprint);
        backlogViewController.saveSprint(sprint);
        taskViewController.saveSprint(sprint);
        reviewViewController.saveSprint(sprint);
        retrospectViewController.saveSprint(sprint);
    }
}