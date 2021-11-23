@java.lang.Override
public void onScroll(com.comcast.freeflow.core.FreeFlowContainer container) {
    android.util.Log.d(com.comcast.freeflow.examples.artbook.ArtbookActivity.TAG, ("scroll percent " + (container.getScrollPercentY())));
}