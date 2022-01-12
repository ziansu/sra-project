public void setLabels(java.util.List<java.lang.String> labels) {
    java.lang.System.out.println(("StoryId -story: " + (this.getId())));
    for (java.lang.String labelname : labels) {
        models.StoryLabel.create(this, models.Label.create(labelname));
    }
}