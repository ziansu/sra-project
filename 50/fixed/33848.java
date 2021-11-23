public com.spilgames.spilsdk.gamedata.SpilGameDataCallbacks getGameDataCallbacks() {
    if ((com.spilgames.spilsdk.SpilSdk.spilGameDataCallbacks) != null) {
        return com.spilgames.spilsdk.SpilSdk.spilGameDataCallbacks;
    }
    com.spilgames.spilsdk.SpilSdk.spilGameDataCallbacks = new com.spilgames.spilsdk.gamedata.SpilGameDataCallbacks();
    return com.spilgames.spilsdk.SpilSdk.spilGameDataCallbacks;
}