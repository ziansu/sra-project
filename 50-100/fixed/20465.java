@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_vocab_list, container, false);
    mWordlistView = ((android.widget.ListView) (view.findViewById(R.id.lv_wordlist)));
    adapter.VocabList_adapter vocabListAdapter = new adapter.VocabList_adapter(dalfactory.getIWordDal("word", getActivity()).getWords(), getActivity());
    mWordlistView.setAdapter(vocabListAdapter);
    return view;
}