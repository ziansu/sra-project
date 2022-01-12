@java.lang.SuppressWarnings(value = "deprecation")
public void checkOfflineRewards() {
    java.util.ArrayList<java.lang.String> copy = getOfflineRewards();
    setOfflineRewards(new java.util.ArrayList<java.lang.String>());
    for (java.lang.String str : com.Ben12345rocks.AdvancedCore.Util.Misc.ArrayUtils.getInstance().convert(copy)) {
        com.Ben12345rocks.AdvancedCore.Objects.RewardHandler.getInstance().giveReward(this, str, false, true, false);
    }
}