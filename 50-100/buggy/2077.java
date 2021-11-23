private int getParentTabNo() {
    int tabNo = m_vo.TabNo;
    int currentLevel = m_vo.TabLevel;
    int parentLevel = currentLevel - 1;
    if (parentLevel < 0)
        return tabNo;
    
    while (parentLevel != currentLevel) {
        tabNo--;
        currentLevel = org.compiere.util.Env.getContextAsInt(m_vo.ctx, m_vo.WindowNo, tabNo, org.compiere.model.GridTab.CTX_TabLevel);
    } 
    return tabNo;
}