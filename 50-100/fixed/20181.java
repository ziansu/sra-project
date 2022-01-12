private android.widget.EditText addEditTextView() {
    android.widget.EditText editTv = new android.widget.EditText(this);
    editTv.setLayoutParams(new android.widget.TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
    editTv.setBackgroundResource(R.drawable.border);
    editTv.setTextColor(getResources().getColor(R.color.black));
    editTv.setGravity(Gravity.CENTER);
    editTv.setEms(3);
    editTv.setSingleLine(true);
    editTv.setEllipsize(TextUtils.TruncateAt.END);
    return editTv;
}