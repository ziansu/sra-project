public void actionPerformed(java.awt.event.ActionEvent event) {
    if ((movieIdChosen) != null) {
        int id = java.lang.Integer.parseInt(movieIdChosen);
        rentalInfoController.returnMovie(id, clientSelected.getId());
        movieController.returnMovie(id, panel, scroll);
    }
}