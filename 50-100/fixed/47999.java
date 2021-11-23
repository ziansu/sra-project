@java.lang.Override
public void updateStoryObject(com.parse.ParseObject activeStory) {
    java.lang.System.out.println(story_title.getText().toString());
    {
        activeStory.put("title", story_title.getText().toString());
        activeStory.put("summary", story_summary.getText().toString());
        activeStory.put("who", story_who.getText().toString());
        activeStory.put("media", media);
        activeStory.put("updatedAt", new java.util.Date());
    }
}