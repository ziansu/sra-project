public boolean canBeBloodbent() {
    if (isAvatarState()) {
        if (isChiBlocked()) {
            return true;
        }
    }
    if ((canBendIgnoreBindsCooldowns(com.projectkorra.projectkorra.ability.CoreAbility.getAbility("Bloodbending"))) && (!(isToggled()))) {
        return false;
    }
    return true;
}