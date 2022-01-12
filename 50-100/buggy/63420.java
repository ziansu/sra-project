public void actionPerformed(java.awt.event.ActionEvent e) {
    controller.File_Manager file = new controller.File_Manager();
    java.util.ArrayList<model.Lager> lager = file.load_inventory();
    view.Warehouse window = new view.Warehouse();
    window.frame.setVisible(true);
    window.getModel().setLagerliste(lager);
    window.setLager(lager);
    window.refresh();
    frame.dispose();
}