public boolean isAM(boolean AM) {
    if (AM == true) {
        m_timeZone = true;
        m_timeOfDay = "A.M.";
    }else {
        m_timeZone = false;
        m_timeOfDay = "P.M.";
    }
    return m_timeZone;
}