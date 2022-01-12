public void tableChanged(javax.swing.event.TableModelEvent e) {
    if (!(isFirstToLastRow(e)))
        return ;
    
    if (getPositionsModel().isContinousRange())
        return ;
    
    handlePositionsUpdate();
}