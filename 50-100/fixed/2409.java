public int getLastScrollPosition() {
    int position = (_elements.size()) - 1;
    if (position < 0)
        return 0;
    
    int heightUsed = _elements.get(position).getHeight();
    while ((position > 0) && (heightUsed < (sizeY))) {
        position--;
        heightUsed += _elements.get(position).getHeight();
    } 
    return position + 1;
}