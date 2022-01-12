@dagger.Provides
@javax.inject.Singleton
com.squareup.picasso.Picasso providePicasso(com.example.velibisk.rssreader.Application application, com.squareup.okhttp.OkHttpClient okHttpClient) {
    return new com.squareup.picasso.Picasso.Builder(application).downloader(new com.squareup.picasso.OkHttpDownloader(okHttpClient)).build();
}