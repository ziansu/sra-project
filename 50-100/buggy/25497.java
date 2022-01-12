public sir.barchable.clash.protocol.Message getOwnHomeData() throws java.io.IOException {
    java.lang.String villageJson = sir.barchable.util.Json.toString(homeVillage);
    ownHomeData.set("homeVillage", villageJson);
    ownHomeData.set("timeStamp", ((int) ((java.lang.System.currentTimeMillis()) / 1000)));
    return ownHomeData;
}