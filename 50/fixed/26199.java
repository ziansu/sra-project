public void clear() {
    if ((data) == null)
        return ;
    
    data.clear();
    data = null;
    notifyAllDataChanged();
}