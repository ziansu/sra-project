public static java.lang.String[] normalizeSummonerNames(net.rithms.riot.constant.Platform platform, java.lang.String... summonerNames) {
    java.util.Objects.requireNonNull(summonerNames);
    for (int i = 0; i < (summonerNames.length); i++) {
        summonerNames[i] = net.rithms.util.RiotApiUtil.normalizeSummonerName(platform, summonerNames[i]);
    }
    return summonerNames;
}