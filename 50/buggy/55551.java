@java.lang.Override
public boolean remove() {
    if (pointer.remove()) {
        owner.getCreatures().remove(this);
        CardGame.instance.getTriggers().trigger(Triggers.EXIT_CREATURE_FILTER, this);
        return true;
    }else
        return false;
    
}