public void getImageAsync(com.andreadec.musicplayer.PlayableItem item, com.andreadec.musicplayer.ImageView imageView) {
    com.andreadec.musicplayer.Bitmap image;
    synchronized(cache) {
        image = cache.get(item.getPlayableUri());
    }
    if (image == null) {
        com.andreadec.musicplayer.ImagesCache.ImageLoaderTask imageLoader = new com.andreadec.musicplayer.ImagesCache.ImageLoaderTask(item, imageView);
        imageLoader.execute();
    }else {
        imageView.setImageBitmap(image);
        imageView.setVisibility(View.VISIBLE);
    }
}