public void highlight(edu.ntust.csie.se.mdfk.sophiatag.data.Tag tag) {
    java.util.Map.Entry<java.lang.String, edu.ntust.csie.se.mdfk.sophiatag.service.Highlighter.KeywordColorBundle> entry = this.keywords.floorEntry(tag.getText());
    if (entry == null) {
        return ;
    }
    this.latestKeywordCache = entry.getKey();
    this.highlightAndAddTag(entry, tag);
}