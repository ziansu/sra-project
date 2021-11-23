public void addTagsOnce(java.util.List<me.abrahanfer.geniusfeed.thirdparty.java.com.cunoraz.tagview.Tag> tags) {
    if (tags == null)
        return ;
    
    mTags = tags;
    if (!(tags.isEmpty()))
        drawTags();
    
}