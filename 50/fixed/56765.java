@java.lang.Override
public boolean remove() {
    CardGame.instance.getTriggers().trigger(Triggers.EXIT_ENCHANTMENT_FILTER, this);
    return true;
}