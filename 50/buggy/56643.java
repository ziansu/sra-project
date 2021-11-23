void onPhotoPicked(android.net.Uri uri) {
    if ((photoEmitter) != null) {
        android.net.Uri copy = android.net.Uri.fromFile(new java.io.File(uri.getPath()));
        photoEmitter.onNext(copy);
        photoEmitter.onComplete();
    }
}