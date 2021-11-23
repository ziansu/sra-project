protected boolean isFinished() {
    switch (m_state) {
        case ON :
            if ((m_terminateWhenEmpty) && (m_launcher.isEmpty()))
                return true;
            else
                return false;
            
        case OFF :
            return true;
        case SINGLE :
            if (m_launcher.isSingleShotDone())
                return true;
            else
                return false;
            
        case UNJAM :
            return false;
    }
    return false;
}