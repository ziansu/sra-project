public java.util.Date getItemDate(int postId) {
    if ((posts.get(postId)) == null) {
        return new java.util.Date(0);
    }
    java.util.Date d = posts.get(postId).date;
    if (d != null) {
        return d;
    }else {
        return new java.util.Date(0);
    }
}