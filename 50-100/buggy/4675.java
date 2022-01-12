@java.lang.Override
public void onDestroy() {
    int lastItemPosition = mLayoutManager.findFirstVisibleItemPosition();
    java.lang.String chapterId = mAdapter.getFocusedChapterId(lastItemPosition);
    java.lang.String frameId = mAdapter.getFocusedFrameId(lastItemPosition);
    com.door43.translationstudio.util.AppContext.setLastFocus(mTargetTranslation.getId(), chapterId, frameId);
    super.onDestroy();
}