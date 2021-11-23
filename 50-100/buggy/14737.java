public android.view.View getViewAt(android.view.View view, int i) {
    com.genonbeta.CoolSocket.test.helper.TemplateItem item = ((com.genonbeta.CoolSocket.test.helper.TemplateItem) (getItem(i)));
    android.widget.TextView text = ((android.widget.TextView) (view.findViewById(R.id.text)));
    if (item.isJson)
        text.setTextColor(Color.GREEN);
    else
        if (item.isShortcut) {
            text.setMaxLines(1);
            text.setTextColor(Color.CYAN);
            text.setEllipsize(TextUtils.TruncateAt.END);
        }
    
    text.setText(item.template);
    return view;
}