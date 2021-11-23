private void start(java.lang.Class<? extends android.app.Activity> cls, java.lang.String typeKey) {
    android.content.Intent intent = new android.content.Intent(context, cls);
    intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
    intent.putExtra(com.shinav.mathapp.progress.Storyteller.TYPE_KEY, typeKey);
    context.startActivity(intent);
    ((android.app.Activity) (context)).overridePendingTransition(R.anim.slide_left_from_outside, R.anim.slide_left_to_outside);
}