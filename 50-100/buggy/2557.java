protected void setUserOnline(java.lang.String onlineChoice) {
    mOnlineActionButton.setText(("Online " + onlineChoice));
    mOnlineActionButton.setTextColor(getResources().getColor(R.color.green));
    mOnlineIndicator.setImageResource(R.drawable.ic_action_online);
    com.raildeliveryservices.burnrubber.utils.Utils.setUserOnline(this, true);
    com.raildeliveryservices.burnrubber.utils.Utils.setDriverOnlineSystem(this, onlineChoice);
    com.raildeliveryservices.burnrubber.utils.Utils.sendUserOnlineToServer(this, true, onlineChoice);
}