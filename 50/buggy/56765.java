@java.lang.Override
public boolean remove() {
    owner.getEnchantments().remove(this);
    CardGame.instance.getTriggers().trigger(Triggers.EXIT_ENCHANTMENT_FILTER, this);
    return true;
}