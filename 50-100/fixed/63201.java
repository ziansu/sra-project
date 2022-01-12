@java.lang.Override
public void onFocusGained() {
    this.setVisible(true);
    m_isSnapping = false;
    m_isFocused = true;
    setZIndex(E_ZIndex.CELL_FOCUSED.get());
    this.ensureTargetLayout();
    m_startingXOffset = m_xOffset;
    m_startingYOffset = m_yOffset;
    this.m_glassPanel.setVisible(false);
    this.addStyleName("visual_cell_focused");
    swarm.client.view.U_Css.allowUserSelect(m_contentPanel.getElement(), true);
    m_sandboxMngr.allowScrolling(m_contentPanel.getElement(), true);
}