@java.lang.Override
public void onFailure(retrofit2.Call<dom.bom.com.tabatasdk.map_module.view.model.Track> call, java.lang.Throwable t) {
    if ((view) != null)
        view.onError(R.string.server_problem);
    
}