@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (e.getActionCommand().contentEquals("OK")) {
        setDifficulty(((org.jtrfp.trcl.game.TVF3Game.Difficulty) (cbDifficulty.getSelectedItem())));
        setCallSign(txtCallsign.getText());
        setBeginMission(true);
        setVisible(false);
    }
}