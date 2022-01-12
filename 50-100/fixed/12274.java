public static boolean isOpened(java.lang.String p_SPS_BC_Request_UUID) {
    if ((org.spinsuite.bchat.view.FV_Thread.m_Request) == null)
        return false;
    
    if (p_SPS_BC_Request_UUID == null)
        return false;
    
    if ((org.spinsuite.bchat.view.FV_Thread.m_Request.getSPS_BC_Request_UUID()) == null)
        return false;
    
    if ((org.spinsuite.bchat.view.FV_Thread.m_Request.getSPS_BC_Request_UUID()) == null)
        return false;
    
    return (org.spinsuite.bchat.view.FV_Thread.m_Request.getSPS_BC_Request_UUID().equals(p_SPS_BC_Request_UUID)) && (org.spinsuite.bchat.view.FV_Thread.m_IsActive);
}