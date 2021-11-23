@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup parent, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.fragment_quote, parent, false);
    mQuoteView = ((android.widget.TextView) (v.findViewById(R.id.quote_text)));
    mAuthorView = ((android.widget.TextView) (v.findViewById(R.id.quote_author)));
    populateList();
    setUpAnimation(v);
    setFont();
    mQuoteView.setText(generateQuote());
    clunkyTextFormat();
    mAuthorView.setText(generateAuthor());
    return v;
}