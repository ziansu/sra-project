public java.util.ArrayList setFellingsSimple(float age) {
    int nHowMany;
    efi.efiscen.gm.GMCell pCell;
    nHowMany = ((m_wXsize) * (m_wYsize)) - 1;
    for (int i = 0; i <= nHowMany; i++) {
        pCell = m_Cells.get(i);
        if ((pCell.getM_Xmin()) >= age) {
            pCell.setM_FellingsShare(1.0F);
            m_Cells.set(i, pCell);
        }
    }
    return m_Cells;
}