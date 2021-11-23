@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putLong(org.dvbviewer.controller.ui.fragments.EpgPager.KEY_GROUP_ID, mGroupId);
    outState.putLong(ChannelPager.KEY_GOUP_INDEX, mGroupIndex);
    outState.putInt(org.dvbviewer.controller.ui.fragments.EpgPager.KEY_CHANNEL_INDEX, mPager.getCurrentItem());
}