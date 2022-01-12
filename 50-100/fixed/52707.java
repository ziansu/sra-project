@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    ID = textID.getText();
    if ((ID) != null) {
        int check = 0;
        for (Patient p : mc.patients) {
            if (ID.equals(p.getId())) {
                test.setText("SUTAPO IR NEZINAU KA DARYT");
                check++;
            }
        }
        if (check == 0) {
            test.setText("No such ID");
        }
    }
}