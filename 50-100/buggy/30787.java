@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_note_detail, container, false);
    com.unleashed.android.notes.ui.NoteDetailFragment.mFragmentContext = rootView.getContext();
    heading = ((android.widget.EditText) (rootView.findViewById(R.id.note_heading)));
    description = ((android.widget.EditText) (rootView.findViewById(R.id.note_description)));
    if ((mItem) != null) {
        heading.setText(noteHeading);
        description.setText(noteDescription);
    }
    return rootView;
}