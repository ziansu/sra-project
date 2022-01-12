public java.util.Date getItemDate(int postId) {
    if ((posts.get(postId)) == null) {
        return null;
    }
    java.util.Date d = posts.get(postId).date;
    if (d != null) {
        return d;
    }else {
        return null;
    }
}