@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_main, container, false);
    taskList = ((android.widget.ListView) (view.findViewById(R.id.lv_task_list)));
    setupViews();
    return view;
}