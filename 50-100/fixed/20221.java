public void actionPerformed(java.awt.event.ActionEvent e) {
    int c = 0;
    for (tabPnl.utils.ViewDictSwitcher v : vecDict) {
        v.setSelected(false);
        if (v.getActionSource().equals(e.getSource())) {
            setVisibleDictionary(veccom.elementAt(c), c);
            v.setSelected(true);
        }
        c++;
    }
}