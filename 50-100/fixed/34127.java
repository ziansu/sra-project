private void displayCountView() {
    display.displayCountView(db.countResults(), db.recountCertification(), new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent event) {
            displayAdminPanel();
        }
    });
    if (!(db.recountCertification())) {
        display.warn("Ballots do not match Number of Voters.");
    }
}