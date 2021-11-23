public com.spilgames.spilsdk.gamedata.SpilGameDataCallbacks getGameDataCallbacks() {
    if ((com.spilgames.spilsdk.SpilSdk.spilGameDataCallbacks) != null) {
        return com.spilgames.spilsdk.SpilSdk.spilGameDataCallbacks;
    }
    return new com.spilgames.spilsdk.gamedata.SpilGameDataCallbacks();
}