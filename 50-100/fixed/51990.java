@android.support.annotation.Nullable
public static android.content.Intent createChooserIntent(@android.support.annotation.NonNull
android.content.Intent targetIntent, @android.support.annotation.Nullable
java.lang.CharSequence chooserTitle, @android.support.annotation.NonNull
android.content.Context context, java.lang.String packageNameBlacklistRegex) {
    java.util.List<android.content.Intent> intents = org.wikipedia.util.ShareUtils.queryIntents(context, targetIntent, packageNameBlacklistRegex);
    if (intents.isEmpty()) {
        return null;
    }
    android.content.Intent bestIntent = intents.remove(0);
    return android.content.Intent.createChooser(bestIntent, chooserTitle).putExtra(Intent.EXTRA_INITIAL_INTENTS, intents.toArray(new android.os.Parcelable[intents.size()]));
}