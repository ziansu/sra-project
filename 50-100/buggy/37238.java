@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    rootView = inflater.inflate(R.layout.home_fragment_main, container, false);
    notSmokedForTextView = ((android.widget.TextView) (rootView.findViewById(R.id.timeNotSmokedTextView)));
    todaySmokedTextView = ((android.widget.TextView) (rootView.findViewById(R.id.tv_cigarettesSmokedToday)));
    moneySavedTextView = ((android.widget.TextView) (rootView.findViewById(R.id.tv_moneySaved)));
    cigarettesNotSmokedTextView = ((android.widget.TextView) (rootView.findViewById(R.id.cigarettesNotSmokedTodayTextView)));
    createChart();
    return rootView;
}