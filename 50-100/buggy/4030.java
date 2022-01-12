public static int codeNameToApi(@com.android.annotations.NonNull
java.lang.String text) {
    int dotIndex = text.lastIndexOf('.');
    if (dotIndex != (-1)) {
        text = text.substring((dotIndex + 1));
    }
    return com.android.sdklib.SdkVersionInfo.getApiByBuildCode(text, true);
}