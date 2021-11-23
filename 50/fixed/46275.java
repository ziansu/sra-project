private boolean loadData() {
    if ((org.spinsuite.util.Env.isEnvLoad()) && (!(m_IsLoadOk))) {
        role_ID = loadRole();
        m_IsLoadOk = true;
    }
    return false;
}