@java.lang.Override
public void onClick(android.view.View v) {
    if ((quoteTextView.getVisibility()) == (android.view.View.GONE)) {
        quoteTextView.setVisibility(View.VISIBLE);
    }else {
        quoteTextView.setVisibility(View.GONE);
        dateTextView.setVisibility(View.VISIBLE);
    }
}