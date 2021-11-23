public void SetLake() {
    if ((!(Walkable())) && (Sea())) {
        throw new java.lang.IllegalStateException("!Walkable() && Sea()");
    }
    m_altitude = -1;
}