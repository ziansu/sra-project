@java.lang.Override
public void onClick(android.view.View v) {
    mXibaListPlayUtil.toggleTinyScreen(url, position, holder.container, eventCallback, eventCallback, new android.graphics.Point(500, 300), 600, 1400, true);
    eventCallback.bindHolder(holder, position);
    if ((mXibaListPlayUtil.getCurrentScreen()) == (com.axiba.xibavideoplayer.XibaVideoPlayer.SCREEN_WINDOW_TINY)) {
        holder.tinyscreenBN.setText("返回");
    }else {
        holder.tinyscreenBN.setText("小屏");
    }
}