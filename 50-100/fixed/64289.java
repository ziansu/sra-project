public void set(final com.charlesmadere.hummingbird.models.MediaStory mediaStory, final com.charlesmadere.hummingbird.models.Feed feed) {
    final java.util.ArrayList<java.lang.Object> list = new java.util.ArrayList<>();
    list.add(mediaStory);
    final java.util.ArrayList<com.charlesmadere.hummingbird.models.AbsSubstory> substories = feed.getSubstories();
    if ((substories == null) || (substories.isEmpty())) {
        list.add(getContext().getString(R.string.nothing_more_to_show));
    }else {
        list.addAll(substories);
    }
    super.set(list);
}