@java.lang.Override
public void freeze() {
    if ((map) == null)
        return ;
    
    java.util.List<? extends com.madthrax.ridiculousRPG.movement.Movable> events = map.getAllEvents();
    for (int i = 0, len = events.size(); i < len; i++) {
        events.get(i).getMoveHandler().freeze();
    }
}