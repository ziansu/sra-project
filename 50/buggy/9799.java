@java.lang.Override
public void onClick(android.view.View v) {
    mFScreenEventCallback.setHolder(holder);
    mXibaListPlayUtil.startFullScreen(url, position, holder.container, eventCallback, mFScreenEventCallback);
    eventCallback.bindHolder(holder, position);
}