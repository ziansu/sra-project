public void updateInstruction(java.lang.String text) {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.N)) {
        instruction.setText(android.text.Html.fromHtml(text, Html.FROM_HTML_MODE_LEGACY));
    }else {
        instruction.setText(android.text.Html.fromHtml(text));
    }
}