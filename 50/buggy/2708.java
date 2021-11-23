@java.lang.Override
public void setLoadMetersEnabled(boolean enabled) {
    if ((m_loadMetersEnabled) == enabled) {
        return ;
    }
    m_loadMetersEnabled = enabled;
    fDataModel.setLoadMetersEnabled(m_loadMetersEnabled);
    disposeLoadMeterTimer();
}