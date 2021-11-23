@java.lang.Override
public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    int index = configurationList.getSelectedIndex();
    pl.edu.agh.two.abdms.gui.controller.Configuration cfg = configurationList.getModel().getElementAt(index);
    loadData(cfg);
}