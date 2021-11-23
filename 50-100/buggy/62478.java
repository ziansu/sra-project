@java.lang.Override
public void setState(java.util.Map newState) {
    setDamage(((int) (newState.get("damage"))));
    setDamageMultiplier(((float) (newState.get("damageMult"))));
    setMoney(((int) (newState.get("money"))));
    setMoneyPerSecond(((int) (newState.get("moneyPerSec"))));
    setLastLogOn(((long) (newState.get("lastLogOn"))));
}