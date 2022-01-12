@java.lang.Override
protected void onTakeView(com.kilogramm.mattermost.view.menu.GeneralActivity generalActivity) {
    super.onTakeView(generalActivity);
    com.kilogramm.mattermost.model.entity.Channel channel = realm.where(com.kilogramm.mattermost.model.entity.Channel.class).equalTo("type", "O").findFirst();
    if (channel != null)
        setSelectedChannel(channel.getId(), channel.getName());
    
}