@java.lang.Override
protected boolean updateCurrentBar(long time, double price) {
    return m_tick.update(price);
}