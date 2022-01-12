public void reloadOrder() {
    if ((m_CurrentOrder) == null) {
        if (((m_RecordPosition) != (-1)) && ((m_RecordPosition) < (m_OrderList.size()))) {
            setOrder(m_OrderList.get(m_RecordPosition));
        }
        return ;
    }
    m_CurrentOrder.load(m_CurrentOrder.get_TrxName());
    m_CurrentOrder.getLines(true, "");
    m_BPartner = org.compiere.model.MBPartner.get(getCtx(), m_CurrentOrder.getC_BPartner_ID());
}