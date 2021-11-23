public void activate(android.content.Context context) {
    if ((activity) != null) {
        context.startActivity(new android.content.Intent(context, activity));
    }
}