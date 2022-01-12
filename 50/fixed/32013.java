public void startService(java.lang.String category, int pageNumber) {
    android.content.Intent intent = new android.content.Intent(this, com.example.picturemanager.ThumbnailDownloadService.class);
    intent.putExtra("category", category);
    intent.putExtra("pageNumber", pageNumber);
    startService(intent);
}