public boolean is24Hour(boolean time) {
    if (time == true) {
        m_timeUpperBound = 24;
        return true;
    }else {
        m_timeUpperBound = 12;
        return false;
    }
}