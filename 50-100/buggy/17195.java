private java.util.List<org.letsdoitukraine.androidapp.model.newsItems.PostMain> convertFacebookPostList(java.util.List<org.letsdoitukraine.androidapp.model.newsItems.facebook.FacebookPost> list) {
    java.util.List<org.letsdoitukraine.androidapp.model.newsItems.PostMain> facebookPostList = new java.util.ArrayList<>();
    for (org.letsdoitukraine.androidapp.model.newsItems.facebook.FacebookPost facebookPost : list) {
        facebookPostList.add(new org.letsdoitukraine.androidapp.model.newsItems.PostMain(facebookPost));
    }
    return facebookPostList;
}