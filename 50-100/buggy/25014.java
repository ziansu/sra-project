@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = null;
    view = inflater.inflate(R.layout.fragment_questions, container, false);
    butterknife.ButterKnife.bind(this, view);
    lvQuestions = ((android.widget.ListView) (view.findViewById(R.id.lvQuestions)));
    com.cp1.translator.fragments.PageFragment.questions = new java.util.ArrayList<>(10);
    com.cp1.translator.fragments.PageFragment.questionsAdapter = new com.cp1.translator.adapters.QuestionsAdapter(getActivity(), com.cp1.translator.fragments.PageFragment.questions);
    lvQuestions.setAdapter(com.cp1.translator.fragments.PageFragment.questionsAdapter);
    return view;
}