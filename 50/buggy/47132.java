public void setActivityContext(android.content.Context ctx) {
    mActivityContext = ctx;
    if ((mButler) == null) {
        mButler = new me.makeachoice.movies.controller.butler.MovieButler(mActivityContext, this);
    }
}