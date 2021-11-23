public void remove(int entryIndex) {
    if ((entryIndex < 0) || (entryIndex >= (_entries.size())))
        return ;
    
    _entries.remove(entryIndex);
    _selectedEntry = -1;
}