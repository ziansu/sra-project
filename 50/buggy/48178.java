@java.lang.Override
public void run() {
    new com.afollestad.materialdialogs.MaterialDialog.Builder(activity).cancelable(false).title(stringValuesMap.get(Constants.ANDVERSION_WHATSNEW_TITLE)).content(features).positiveText(Constants.ANDVERSION_OK).show();
}