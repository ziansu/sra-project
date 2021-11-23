public void actionPerformed(java.awt.event.ActionEvent e) {
    int c = 0;
    for (tabPnl.utils.ViewDictSwitcher v : vecDict) {
        v.setSelected(false);
        setVisibleDictionary(veccom.elementAt(c), c);
        if (v.getActionSource().equals(e.getSource())) {
            v.setSelected(true);
        }
        c++;
    }
}