@java.lang.SuppressWarnings(value = "deprecation")
public static android.text.Spanned fromHtml(java.lang.String text) {
    if (org.linphone.mediastream.Version.sdkAboveOrEqual(Version.API24_NOUGAT_70)) {
        return android.text.Html.fromHtml(text, 0);
    }else {
        return android.text.Html.fromHtml(text);
    }
}