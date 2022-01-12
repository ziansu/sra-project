@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent ae) {
    this.execPanel.runMainThread(Starter.class, new java.lang.String[]{ this.robotColorList.getSelectedValue() , this.humanColorList.getSelectedValue() , "robot=yes" , this.difficultyList.getSelectedValue() , this.rulesList.getSelectedValue() });
    this.mainLayout.last(getContentPane());
    this.setResizable(true);
    this.setMinimumSize(GUIStarter.PLAY_SIZE);
    this.setSize(GUIStarter.CHOOSER_SIZE);
}