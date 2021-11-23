public static com.afollestad.materialdialogs.MaterialDialog buildOpenImageProgressDialog(android.app.Activity activity) {
    return new com.afollestad.materialdialogs.MaterialDialog.Builder(activity).title(R.string.open_image_progress_dialog_title).content(R.string.open_image_progress_dialog_content).progress(true, 0).cancelable(false).build();
}