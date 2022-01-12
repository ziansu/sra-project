@java.lang.Override
public boolean checkTrigger(mage.game.events.GameEvent event, mage.game.Game game) {
    mage.game.stack.StackObject item = game.getState().getStack().getFirst();
    if ((item instanceof mage.game.stack.StackAbility) && ((((mage.game.stack.StackAbility) (item)).getStackAbility()) instanceof mage.abilities.keyword.CyclingAbility)) {
        return true;
    }
    return false;
}