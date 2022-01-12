@java.lang.Override
public void keyReturned(org.compiere.model.MPOSKey key) {
    if ((v_POSPanel.hasOrder()) && (v_POSPanel.isCompleted())) {
        v_POSPanel.refreshProductInfo(key);
        return ;
    }
    v_POSPanel.addLine(key.getM_Product_ID(), key.getQty());
    v_POSPanel.refreshProductInfo(key);
    return ;
}