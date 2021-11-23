@java.lang.Override
public void run() {
    java.lang.String[] tagArray = new java.lang.String[]{ "example_tag" };
    boolean success = com.appoxee.Appoxee.addTagsToDevice(new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(tagArray)));
    android.util.Log.d(gigigo.com.orchextrasdk.MainActivity.TAG, ("custom field set success: " + success));
    java.util.List<java.lang.String> tags = com.appoxee.Appoxee.getTagList();
    android.util.Log.d(gigigo.com.orchextrasdk.MainActivity.TAG, ("tags list: " + tags));
}