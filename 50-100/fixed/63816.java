@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_new_text_todo, container, false);
    etTextContent = ((android.widget.EditText) (view.findViewById(R.id.new_todo_et_content)));
    android.os.Bundle args = getArguments();
    if (args != null) {
        java.lang.String content = getArguments().getString(TodoConstants.Intent.TEXTCONTENT);
        if (content != null) {
            etTextContent.setText(content);
        }
    }
    return view;
}