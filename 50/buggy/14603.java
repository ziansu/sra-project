@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    android.util.Log.i("myMapFragment", "onViewCreated");
    com.example.patrick.myapplication.view.MyMapFragment.GetNodeListTask getNodeListTask = new com.example.patrick.myapplication.view.MyMapFragment.GetNodeListTask();
    getNodeListTask.execute();
}