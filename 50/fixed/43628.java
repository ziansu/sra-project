public void focusLost(java.awt.event.FocusEvent e) {
    if (e.isTemporary())
        return ;
    
    org.compiere.pos.SubCurrentLine.log.info("PosSubProduct - focusLost");
    findProduct();
    p_posPanel.updateInfo();
}