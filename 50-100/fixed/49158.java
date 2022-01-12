public boolean isClone(orlevy.com.myproject.Note another) {
    if (((this.note.equals(another.note)) && (this.subject.equals(another.subject))) && ((this.star) == (another.star))) {
        return true;
    }
    return false;
}