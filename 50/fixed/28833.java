public it.unica.enotes.Note getNoteAtIndex(int index) {
    if ((index >= (this._notes.size())) || (index < 0))
        return null;
    
    return this._notes.get(index);
}