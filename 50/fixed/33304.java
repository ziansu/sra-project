public void SetLake() {
    if (!((!(Walkable())) && (Sea()))) {
        throw new java.lang.IllegalStateException();
    }
    m_altitude = -1;
}