private static void setStory(models.Story story, java.lang.String title, java.lang.String summary, java.lang.String contentJSON, java.lang.Boolean published, java.util.List<models.Location> locations) throws java.io.IOException {
    story.setTitle(title);
    story.setSummary(summary);
    story.setContent(contentJSON);
    story.setPublished(published);
    story.setLocations(locations);
    if ((locations != null) && ((locations.size()) > 0))
        story.setLocationName(locations.get(0).name);
    
}