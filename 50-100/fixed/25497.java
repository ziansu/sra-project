public sir.barchable.clash.protocol.Message getOwnHomeData() throws java.io.IOException {
    ownHomeData.set("homeVillage", sir.barchable.util.Json.toString(homeVillage));
    ownHomeData.set("timeStamp", ((int) ((java.lang.System.currentTimeMillis()) / 1000)));
    return ownHomeData;
}