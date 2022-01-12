private android.content.Intent createShareActionIntent() {
    if ((ru.guu.my.myguuruclient.DetailFragment.mClassDescriptionStr) == null)
        return null;
    
    android.content.Intent shareIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    shareIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
    shareIntent.setType("text/plain");
    shareIntent.putExtra(Intent.EXTRA_TEXT, ((ru.guu.my.myguuruclient.DetailFragment.mClassDescriptionStr) + (ru.guu.my.myguuruclient.DetailFragment.SHARE_TAG)));
    return shareIntent;
}