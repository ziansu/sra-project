@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    org.md2k.utilities.Report.Log.d(org.md2k.ema.FragmentTextNumeric.TAG, ("onCreateView() mPageNumber=" + (mPageNumber)));
    final android.view.ViewGroup rootView = ((android.view.ViewGroup) (inflater.inflate(R.layout.fragment_text_numeric, container, false)));
    questionAnswer.setPrompt_time(org.md2k.datakitapi.time.DateTime.getDateTime());
    setQuestionText(rootView, questionAnswer);
    setEditText(rootView);
    return rootView;
}