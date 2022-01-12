public void SetSea() {
    if (!((!(Walkable())) && (SeaOrLake()))) {
        throw new java.lang.IllegalStateException();
    }
    m_altitude = 0;
}