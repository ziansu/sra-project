@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if ((getArguments()) != null) {
        if ((getArguments().getString(Variable.TAG_GROUP_ID)) != null)
            mGroupId = getArguments().getString(Variable.TAG_GROUP_ID);
        
    }
    return inflater.inflate(R.layout.fragment_add_new_message, container, false);
}