@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_period_chart, container, false);
    butterknife.ButterKnife.bind(this, view);
    periodChartsView = new com.fantasystock.fantasystock.ViewHolder.PeriodChartsView(view, getActivity());
    return view;
}