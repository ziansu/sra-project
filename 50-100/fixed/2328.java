private void removeFromList(de.mizapf.timt.files.Directory deldir) {
    de.mizapf.timt.files.Directory[] aold = m_Subdirs;
    m_Subdirs = new de.mizapf.timt.files.Directory[(aold.length) - 1];
    int poso = 0;
    int posn = 0;
    while (poso < (aold.length)) {
        if (aold[poso].getName().equals(deldir.getName()))
            poso++;
        else
            m_Subdirs[(posn++)] = aold[(poso++)];
        
    } 
}