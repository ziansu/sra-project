public void giveLucky(com.Ben12345rocks.AdvancedCore.Objects.User user, java.util.HashMap<java.lang.String, java.lang.String> placeholders) {
    for (java.util.Map.Entry<java.lang.Integer, java.lang.String> entry : luckyRewards.entrySet()) {
        if (com.Ben12345rocks.AdvancedCore.Util.Misc.MiscUtils.getInstance().checkChance((1 / (entry.getKey())), entry.getKey())) {
            new com.Ben12345rocks.AdvancedCore.Objects.RewardBuilder(getConfig().getData(), entry.getValue()).withPlaceHolder(placeholders).send(user);
        }
    }
}