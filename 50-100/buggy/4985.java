@java.lang.Override
public java.util.ArrayList<com.lab.flickr.network.Loader> createLoaders() {
    android.util.Log.d(this.getClass().getSimpleName(), ("Number of threads for image loading : " + (com.lab.flickr.fragments.FragImageLoader.NUM_THREADS)));
    java.util.ArrayList<com.lab.flickr.network.Loader> loaders = new java.util.ArrayList<>();
    for (int i = 0; i < (com.lab.flickr.fragments.FragImageLoader.NUM_THREADS); i++) {
        loaders.add(new com.lab.flickr.network.ImageLoader(JobRegister.Job.MAIN_IMAGES));
    }
    return loaders;
}