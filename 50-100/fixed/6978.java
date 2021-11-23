@java.lang.Override
public void call(com.moac.android.refuge.activity.MainActivity.CirclesViewModel circlesViewModel) {
    mapFragment.clear();
    if ((circlesViewModel.maxFlow) > 0) {
        com.moac.android.refuge.util.Visualizer.drawCountries(refugeeDataStore, mapFragment, circlesViewModel.countries, circlesViewModel.maxFlow);
    }else
        if (!(circlesViewModel.countries.isEmpty())) {
            android.widget.Toast.makeText(this, "No refugee flows found", Toast.LENGTH_LONG).show();
        }
    
}