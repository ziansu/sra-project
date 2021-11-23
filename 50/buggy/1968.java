private boolean VerifyNoteId(int id) {
    return (id < (this._notes.size())) && (id >= 0);
}