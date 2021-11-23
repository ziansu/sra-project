private void issueWindowClosing() {
    if (addIssueMode) {
        projectManager.setAddIssueWindowShow(false);
    }else {
        projectManager.getOpeningIssuesList().remove(((table.getName()) + (issue.getId())), this);
        projectManager.getSelectedTabCustomIdList(table.getName()).delete(issue.getId());
        projectManager.getSelectedTabCustomIdList(table.getName()).printOutIDList();
    }
    this.dispose();
}