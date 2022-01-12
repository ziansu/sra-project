@java.lang.Override
public void onClick(android.view.View v) {
    if ((mListener) != null) {
        java.lang.String toText = mToTextView.getText().toString();
        if (!(getResString(R.string.to_hint).equals(toText))) {
            mListener.onToClick(toText);
        }
    }
}