public static java.lang.String getHashForBinaryContents(android.app.Activity mainActivity, boolean isDebugMode) {
    try {
        return com.microsoft.codepush.react.CodePushUtils.getStringFromInputStream(mainActivity.getAssets().open(CodePushConstants.CODE_PUSH_HASH_FILE_NAME));
    } catch (java.io.IOException e) {
        if (!isDebugMode) {
            com.microsoft.codepush.react.CodePushUtils.log("Unable to get the hash of the binary\'s bundled resources - \"codepush.gradle\" may have not been added to the build definition.");
        }
        return null;
    }
}