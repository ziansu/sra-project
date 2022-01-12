@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.tab_analysis, container, false);
    android.widget.RelativeLayout layout = ((android.widget.RelativeLayout) (v.findViewById(R.id.analysis1)));
    com.raingoddess.lapclient.main.TabAnalysis.temp_list = new java.util.ArrayList<>();
    com.raingoddess.lapclient.main.TabAnalysis.temp_list.clear();
    com.raingoddess.lapclient.main.TabAnalysis.temp_list = com.raingoddess.lapclient.main.SendInputToHost.getChampionStatResponse();
    setupChampPool(v);
    return v;
}