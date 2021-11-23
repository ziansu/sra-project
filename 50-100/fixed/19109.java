public boolean canBeBloodbent() {
    if (isAvatarState()) {
        if (isChiBlocked()) {
            return true;
        }else {
            return false;
        }
    }
    if ((canBendIgnoreBindsCooldowns(com.projectkorra.projectkorra.ability.CoreAbility.getAbility("Bloodbending"))) && (isToggled())) {
        return false;
    }
    return true;
}