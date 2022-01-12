public void setStudyAccessFormValues(int panelIndex, java.lang.String visibility, java.lang.String studyContainer, java.lang.String displayName) {
    sleep(1000);
    setStudyAccessVisibility(panelIndex, visibility);
    if (displayName != null)
        setStudyAccessDisplayName(panelIndex, displayName);
    
    sleep(1000);
    setStudyAccessStudyContainer(panelIndex, studyContainer);
}