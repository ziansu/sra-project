protected void removeFromList(de.mizapf.timt.files.TFile delfile) {
    de.mizapf.timt.files.TFile[] aold = m_Files;
    m_Files = new de.mizapf.timt.files.TFile[(aold.length) - 1];
    int poso = 0;
    int posn = 0;
    while (poso < (aold.length)) {
        if (aold[poso].getName().equals(delfile.getName()))
            poso++;
        else
            m_Files[(posn++)] = aold[(poso++)];
        
    } 
}