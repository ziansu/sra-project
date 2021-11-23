@java.lang.Override
public void run() {
    java.lang.String[] tagArray = new java.lang.String[]{ "example_tag" };
    boolean success = com.appoxee.Appoxee.addTagsToDevice(new gigigo.com.orchextrasdk.ArrayList<java.lang.String>(gigigo.com.orchextrasdk.Arrays.asList(tagArray)));
    android.util.Log.d(gigigo.com.orchextrasdk.MainActivity.TAG, ("custom field set success: " + success));
    gigigo.com.orchextrasdk.ArrayList<java.lang.String> tags = com.appoxee.Appoxee.getTagList();
    android.util.Log.d(gigigo.com.orchextrasdk.MainActivity.TAG, ("tags list: " + tags));
}