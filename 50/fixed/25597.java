private java.util.List<android.net.Uri> extractInputUrlsFromIntent(android.content.Intent intent) {
    java.util.ArrayList<android.net.Uri> uris = intent.getParcelableArrayListExtra(vandy.mooc.assignments.assignment.activities.GalleryActivity.INTENT_EXTRA_URLS);
    if (validateInput(uris)) {
        return uris;
    }else {
        return null;
    }
}