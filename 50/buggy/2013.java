@java.lang.Override
public void onStart() {
    super.onStart();
    if (!(mAutoUpdated))
        mMoviesPresenter.start();
    
}