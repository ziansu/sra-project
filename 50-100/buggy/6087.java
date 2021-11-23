@java.lang.Override
public mage.Mana getMana(mage.game.Game game, mage.abilities.Ability source) {
    mage.Mana mana = null;
    if (condition.apply(game, source)) {
        mana = effect.getMana();
    }else
        if ((otherwiseEffect) != null) {
            mana = otherwiseEffect.getMana();
        }
    
    if (mana != null) {
        checkToFirePossibleEvents(mana, game, source);
    }
    return mana;
}