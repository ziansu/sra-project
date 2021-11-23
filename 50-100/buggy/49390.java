public void updateInstruction() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.N)) {
        instruction.setText(android.text.Html.fromHtml(mRoute.steps.get(mStep).htmlInstruction, Html.FROM_HTML_MODE_LEGACY));
    }else {
        instruction.setText(android.text.Html.fromHtml(mRoute.steps.get(mStep).htmlInstruction));
    }
}