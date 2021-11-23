public static android.content.Intent create(@android.support.annotation.NonNull
final android.content.Context context, @android.support.annotation.NonNull
final java.lang.String packageName) {
    final android.content.Intent intent = new android.content.Intent(context, uk.co.alt236.resourcemirrorsampleapp.activities.resourcetypes.ResourceTypesActivity.class);
    final android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString(CommonExtras.EXTRA_PACKAGE_NAME, uk.co.alt236.resourcemirrorsampleapp.activities.resourcetypes.ResourceTypesActivityIntentFactory.getPackageName(context, packageName));
    intent.putExtras(bundle);
    return intent;
}