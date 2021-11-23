@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getID()) == (java.awt.event.ActionEvent.ACTION_PERFORMED)) {
        java.lang.System.out.println("HI");
        if (((count) % 2) == 0) {
            world = true;
            uploadWorldTournament.setEnabled(false);
            if (((teamOne) && (teamTwo)) && (world)) {
                playTournament.setEnabled(true);
            }
        }else {
            world = false;
            uploadWorldTournament.setEnabled(true);
        }
        (count)++;
    }
}