public java.lang.String getTitle() {
    java.util.HashMap<java.lang.String, java.lang.String> tagMap = story.getTagMap();
    return utybo.branchingstorytree.swing.Lang.get("story.title").replace("$t", tagMap.getOrDefault("title", "story.missingtitle")).replace("$a", tagMap.getOrDefault("author", utybo.branchingstorytree.swing.Lang.get("story.missingauthor")));
}