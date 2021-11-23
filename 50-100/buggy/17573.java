public void setComment(java.lang.String comment) {
    if ((this.comment) == null) {
        this.comment = "";
        this.comment += comment;
        this.comment += "\n";
    }else {
        this.comment = ((comment + "\n") + (this.comment)) + "\n";
    }
    notifyListeners();
}