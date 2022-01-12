public void handleEvent(org.eclipse.swt.widgets.Event event) {
    if ((numSkillPoints) > 0) {
        unusedSkillPointsError.setVisible(true);
        return ;
    }
    character.setSkills(charSkills);
    if ((cw.wizPageNum) < ((wizPagesSize) - 1))
        (cw.wizPageNum)++;
    
    if (!(cw.wizPageCreated[5]))
        createNextPage();
    
    layout.topControl = nextPage;
    panel.layout();
    ((guis.Wiz6) (cw.wizs.get(5))).createBonusPopUp();
}