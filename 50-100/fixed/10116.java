protected void setSelectedPanel(processing.app.contrib.ContributionPanel contributionPanel) {
    contributionTab.contributionManagerDialog.updateStatusPanel(contributionPanel);
    if ((selectedPanel) == contributionPanel) {
        selectedPanel.setSelected(true);
    }else {
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