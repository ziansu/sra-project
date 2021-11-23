@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getID()) == (java.awt.event.ActionEvent.ACTION_PERFORMED)) {
        if (((count) % 2) == 0) {
            uploadWorldTournament.setEnabled(false);
        }else {
            uploadWorldTournament.setEnabled(true);
        }
        (count)++;
    }
}