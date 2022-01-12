public void showSprint(softwaremanagementtool.agile.Sprint sprint) {
    if (sprint != null) {
        infoViewController.showSprint(sprint);
        sprintBlViewController.setAgilePrj(agilePrj, agilePrj.getSprintBacklogList(sprint));
        prodOpenBlViewController.setAgilePrj(agilePrj, agilePrj.getOpenProdBacklogList());
        backlogViewController.showSprint(sprint);
        reviewViewController.showSprint(sprint);
        retrospectViewController.showSprint(sprint);
    }
}