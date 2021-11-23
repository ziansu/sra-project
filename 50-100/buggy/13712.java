public void updatePosts(java.util.List<cm.aptoide.pt.social.data.Post> cards) {
    if (hasUser()) {
        if ((posts.size()) > 1) {
            posts.subList(1, ((posts.size()) - 1)).clear();
        }
        posts.addAll(cards);
    }else {
        this.posts = cards;
    }
    notifyDataSetChanged();
}