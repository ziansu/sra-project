public static java.util.List<android.content.Intent> queryIntents(@android.support.annotation.NonNull
android.content.Context context, @android.support.annotation.NonNull
android.content.Intent targetIntent, java.lang.String packageNameBlacklistRegex) {
    java.util.List<android.content.Intent> intents = new java.util.ArrayList<>();
    for (android.content.pm.ResolveInfo intentActivity : org.wikipedia.util.ShareUtils.queryIntentActivities(targetIntent, context)) {
        if (!(org.wikipedia.util.ShareUtils.isIntentActivityBlacklisted(intentActivity, packageNameBlacklistRegex))) {
            intents.add(org.wikipedia.util.ShareUtils.buildLabeledIntent(targetIntent, intentActivity));
        }
    }
    return intents;
}