@java.lang.Override
public void setSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putParcelable(com.mycvapps.rav.vk1000.WallFragment.RECYCLER_STATE_TAG, mLayoutManager.onSaveInstanceState());
}