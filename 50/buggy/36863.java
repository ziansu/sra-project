public me.shiro.chesto.Danbooru.Posts tags(java.lang.String tags) {
    builder.appendQueryParameter("tags", tags.replace(" ", "+"));
    return this;
}