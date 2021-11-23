public void setup(final com.samsao.messageui.models.Message message) {
    mBalloon.setLayoutParams(new android.support.v7.widget.RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT));
    mBalloon.setMessage(message);
    if ((mTimeStamp) != null) {
        mTimeStamp.setMessage(message);
    }
    if ((message.getSide()) == (com.samsao.messageui.models.Message.THAT_SIDE)) {
        mBalloon.setBalloonBackground(mThatBalloonBackground);
        mBalloon.setBalloonTextColor(mThatBalloonTextColor);
    }else {
        mBalloon.setBalloonBackground(mThisBalloonBackground);
        mBalloon.setBalloonTextColor(mThisBalloonTextColor);
    }
}