public void setLiked(java.lang.Integer count) {
    if (count == null) {
        this.liked = false;
    }
    if (count < 1) {
        this.liked = false;
    }
    if (count == 1) {
        this.liked = true;
    }
}