@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    log.info(("PosQueryProduct.actionPerformed - " + (e.getActionCommand())));
    if (((((e.getSource()) == (f_Processed)) || ((e.getSource()) == (f_DocumentNo))) || ((e.getSource()) == (f_DateFrom))) || ((e.getSource()) == (f_DateTo))) {
        refresh();
        return ;
    }
}