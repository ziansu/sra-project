public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getSource()) == (showAll)) {
        allFilter();
        toggleEnabled(false);
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