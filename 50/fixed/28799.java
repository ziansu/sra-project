public void SetMinAltitude(short a) {
    if (!(a >= 0)) {
        throw new java.lang.IllegalStateException();
    }
    m_minAltitude = a;
}