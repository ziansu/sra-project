@java.lang.Override
public org.appcelerator.titanium.view.TiUIView createView(android.app.Activity activity) {
    mView = new de.appwerft.spinkit.SpinnerViewProxy.SpinnerView(this);
    mView.getLayoutParams().autoFillsHeight = true;
    mView.getLayoutParams().autoFillsWidth = true;
    return mView;
}