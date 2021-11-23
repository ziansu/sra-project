public void actionPerformed(java.awt.event.ActionEvent event) {
    if ((movieIdChosen) != null) {
        int id = java.lang.Integer.parseInt(movieIdChosen);
        movieController.returnMovie(id, panel, scroll);
        rentalInfoController.returnMovie(id, clientSelected.getId());
    }
}