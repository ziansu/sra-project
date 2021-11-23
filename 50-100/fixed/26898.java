@java.lang.Override
public void onResult(com.sendbird.android.GroupChannel groupChannel, com.sendbird.android.SendBirdException e) {
    if (e != null) {
        return ;
    }
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra(com.example.fiveguys.trip_buddy_v0.groupchannel.CreateGroupChannelActivity.EXTRA_NEW_CHANNEL_URL, groupChannel.getUrl());
    setResult(com.example.fiveguys.trip_buddy_v0.groupchannel.RESULT_OK, intent);
    finish();
}