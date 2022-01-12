@org.greenrobot.eventbus.Subscribe
public void onClick(final com.pajato.android.gamechat.event.TagClickEvent event) {
    java.lang.Object payload = event.view.getTag();
    if (!(payload instanceof java.lang.String))
        return ;
    
    java.lang.String tag = ((java.lang.String) (payload));
    if (tag.startsWith("button")) {
        handleTileClick(tag);
        return ;
    }
    if (this.getClass().getSimpleName().equals(tag))
        handleNewGame();
    
}