private java.lang.CharSequence buildTagString() {
    java.util.List<com.todoroo.astrid.data.TagData> sortedTagData = orderByName.sortedCopy(selectedTags);
    java.util.List<android.text.SpannableString> tagStrings = com.google.common.collect.Lists.transform(sortedTagData, tagToString(java.lang.Float.MAX_VALUE));
    android.text.SpannableStringBuilder builder = new android.text.SpannableStringBuilder();
    for (android.text.SpannableString tagString : tagStrings) {
        if ((builder.length()) > 0) {
            builder.append(com.todoroo.astrid.tags.TagsControlSet.HAIR_SPACE);
        }
        builder.append(tagString);
    }
    return builder;
}