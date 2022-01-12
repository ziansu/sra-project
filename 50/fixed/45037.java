public void updateIndex(int newIndex) {
    _index = newIndex;
    if ((_af) != null)
        _af.updateIndex(newIndex);
    
}