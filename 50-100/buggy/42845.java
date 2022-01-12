public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getSource()) == (showAll)) {
        toggleEnabled(false);
        allFilter();
    }else
        if ((e.getSource()) == (showCurrent)) {
            toggleEnabled(false);
            allFilter();
            documentFilter();
        }else
            if ((e.getSource()) == (showFilter)) {
                toggleEnabled(true);
                filter();
            }
        
    
}