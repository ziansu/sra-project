void setChannel(de.christinecoenen.code.zapp.model.ChannelModel channel) {
    logo.setImageResource(channel.getDrawableId());
    logo.setContentDescription(channel.getName());
    if ((channel.getSubtitle()) == null) {
        subtitle.setVisibility(View.GONE);
    }else {
        subtitle.setText(channel.getSubtitle());
        subtitle.setVisibility(View.VISIBLE);
    }
    programInfoView.setChannel(channel);
}