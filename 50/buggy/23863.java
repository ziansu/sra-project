public static bool is24Hour(bool time) {
    if (time == true) {
        m_timeUpperBound = 24;
    }else {
        m_timeUpperBound = 12;
    }
}