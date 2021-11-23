public static java.util.List<android.content.pm.LabeledIntent> queryIntents(android.content.Context context, android.content.Intent targetIntent, java.lang.String packageNameBlacklistRegex) {
    java.util.List<android.content.pm.LabeledIntent> intents = new java.util.ArrayList<>();
    for (android.content.pm.ResolveInfo intentActivity : org.wikipedia.util.ShareUtils.queryIntentActivities(targetIntent, context)) {
        if (!(org.wikipedia.util.ShareUtils.isIntentActivityBlacklisted(intentActivity, packageNameBlacklistRegex))) {
            intents.add(org.wikipedia.util.ShareUtils.buildLabeledIntent(targetIntent, intentActivity));
        }
    }
    return intents;
}