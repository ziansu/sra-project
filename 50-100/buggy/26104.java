public static java.util.ArrayList<java.lang.String> GetChosenTags() {
    java.util.ArrayList<java.lang.String> tags = new java.util.ArrayList<>();
    for (tagger.views.buttons.TagButton btn : tagger.views.buttons.TagButton.GetGroup()) {
        if (btn.isSelected()) {
            tags.add(btn.getText().toLowerCase());
        }
    }
    return tags;
}