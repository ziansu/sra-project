@java.lang.Override
public mage.Mana getMana(mage.game.Game game, mage.abilities.Ability source) {
    mage.Mana mana = null;
    if (condition.apply(game, source)) {
        mana = effect.getMana();
    }else
        if ((otherwiseEffect) != null) {
            mana = otherwiseEffect.getMana();
        }
    
    return mana;
}