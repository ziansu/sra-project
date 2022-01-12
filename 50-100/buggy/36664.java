@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().setTitle("Board");
    java.util.List<java.util.ArrayList<android.support.v4.util.Pair<java.lang.Long, java.lang.String>>> data = new java.util.ArrayList<>();
    for (int i = 0; i < 30; i++) {
        data.add(addColumnList());
    }
    dragPager.setData(data);
    dragPager.notifyData();
}