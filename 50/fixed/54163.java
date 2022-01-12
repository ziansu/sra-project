@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    model.zoom(percent);
    view.updateMapInBB();
}