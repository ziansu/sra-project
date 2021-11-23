@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View root = inflater.inflate(R.layout.addtask_frag, container, false);
    mTitle = ((android.widget.TextView) (root.findViewById(R.id.add_task_title)));
    mDescription = ((android.widget.TextView) (root.findViewById(R.id.add_task_description)));
    setHasOptionsMenu(true);
    setRetainInstance(true);
    return root;
}