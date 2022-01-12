public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = null;
    view = inflater.inflate(R.layout.fragment_quiz_image, container, false);
    total_questions += 1;
    question = ((android.widget.EditText) (view.findViewById(R.id.editText)));
    return view;
}