@java.lang.Override
public void onLoadItem(int position, com.github.yuqilin.qmediaplayerapp.media.MediaWrapper video) {
    mHandler.sendMessage(android.os.Message.obtain(mHandler, com.github.yuqilin.qmediaplayerapp.gui.video.VideoFragment.SCAN_ADD_ITEM, position, 0, video));
}