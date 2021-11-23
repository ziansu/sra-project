public void setComment(java.lang.String comment) {
    if ((comment.length()) > 30) {
        this.comment = comment.substring(0, ID3Tag.Id3TagMp3.MAXLENGTH);
    }else {
        this.comment = ID3Tag.Id3TagMp3.fixTagLen(comment);
    }
}