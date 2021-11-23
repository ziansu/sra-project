public it.unica.enotes.Note getNoteAtIndex(int index) {
    if ((index >= (this._notes.count())) || (index < 0))
        return null;
    
    return this._notes[index];
}