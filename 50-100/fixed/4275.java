private void deleteOrder() {
    if ((m_order) == null)
        return ;
    
    if (m_order.getDocStatus().equals("CO")) {
        if (org.adempiere.webui.window.FDialog.ask(0, this, "Quiere cancelar la orden?")) {
            p_posPanel.m_order.cancelOrder();
        }
    }
    if (org.adempiere.webui.window.FDialog.ask(0, this, "Delete order?"))
        if (m_order.deleteOrder()) {
            m_order = null;
            updateOrder();
            newOrder();
        }
    
}