public android.graphics.Paint getPaintColorFromUserId(java.lang.String userId) {
    return net.aboutgoods.remotedrawing.helper.PaintHelper.createPaintFromRGB(mUserList.get(userId));
}