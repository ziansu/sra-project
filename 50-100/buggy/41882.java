private int getParentTabNo() {
    int tabNo = m_TabNo;
    int currentLevel = org.compiere.util.Env.getContextAsInt(m_ctx, m_WindowNo, tabNo, GridTab.CTX_TabLevel);
    int parentLevel = currentLevel - 1;
    if (parentLevel < 0)
        return tabNo;
    
    while (parentLevel != currentLevel) {
        tabNo--;
        currentLevel = org.compiere.util.Env.getContextAsInt(m_ctx, m_WindowNo, tabNo, GridTab.CTX_TabLevel);
    } 
    return tabNo;
}