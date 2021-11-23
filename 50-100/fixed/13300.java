@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((s.length()) > 0) {
        int mark = java.lang.Integer.parseInt(s.toString());
        if ((mark > 0) && (mark <= 10)) {
            ReviewActivity.floatingActionButton.setBackground(mContext.getResources().getDrawable(R.drawable.circle_red, null));
        }
    }
}