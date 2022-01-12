@java.lang.Override
public com.hearthsim.util.tree.HearthTreeNode applyEffect(com.hearthsim.model.PlayerSide originSide, com.hearthsim.card.Card origin, com.hearthsim.model.PlayerSide targetSide, com.hearthsim.util.tree.HearthTreeNode boardState) {
    com.hearthsim.card.weapon.WeaponCard newWeapon = this.weapon;
    if (origin == null) {
        newWeapon = weapon.deepCopy();
    }
    newWeapon.hasBeenUsed(true);
    com.hearthsim.event.deathrattle.DeathrattleAction weaponDeathrattle = boardState.data_.getCurrentPlayer().getHero().setWeapon(newWeapon);
    if (weaponDeathrattle != null) {
        boardState = weaponDeathrattle.performAction(origin, targetSide, boardState);
    }
    return boardState;
}