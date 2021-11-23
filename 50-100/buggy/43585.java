private void payOrder() {
    if ((m_order) != null) {
        if ((!(m_order.isProcessed())) && (!(m_order.processOrder()))) {
            org.adempiere.webui.window.FDialog.warn(0, p_posPanel, "PosOrderProcessFailed", "");
            return ;
        }
        if (org.compiere.pos.WPosPayment.pay(p_posPanel, this)) {
            printTicket();
            setOrder(0);
        }
    }
}