public boolean checkPreName(java.lang.String nowName, java.lang.String preName) {
    boolean check;
    if (nowName == preName) {
        check = true;
    }else {
        check = false;
        if (preName != "") {
            if (assetsManager.isLoaded(textureAssets.getTexturePath(preName))) {
                assetsManager.unload(textureAssets.getTexturePath(preName));
                assetsManager.finishLoading();
            }
        }
    }
    return check;
}