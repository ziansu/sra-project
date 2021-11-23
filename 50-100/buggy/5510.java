public void select(int x, int y) {
    for (int i = this.size(); i >= 0; i--) {
        if (m_objects.get(i).inRegion(x, y)) {
            select(i);
            break;
        }
    }
}