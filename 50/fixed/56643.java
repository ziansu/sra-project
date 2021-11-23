void onPhotoPicked(android.net.Uri uri) {
    if ((photoEmitter) != null) {
        photoEmitter.onNext(uri);
        photoEmitter.onComplete();
    }
}