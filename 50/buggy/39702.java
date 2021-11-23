private android.net.Uri getDownloadUri() {
    return android.net.Uri.parse(getDownloadUrl().replace("https", "http"));
}