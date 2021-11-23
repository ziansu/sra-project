protected void setSelectedPanel(processing.app.contrib.ContributionPanel contributionPanel) {
    if ((selectedPanel) == contributionPanel) {
        selectedPanel.setSelected(true);
    }else {
        contributionTab.contributionManagerDialog.updateStatusPanel(contributionPanel);
        processing.app.contrib.ContributionPanel lastSelected = selectedPanel;
        selectedPanel = contributionPanel;
        if (lastSelected != null) {
            lastSelected.setSelected(false);
        }
        contributionPanel.setSelected(true);
        updateColors();
        requestFocusInWindow();
    }
}