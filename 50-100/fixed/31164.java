@java.lang.Override
public void onGridItemClick(android.view.View view, int gridGroupPosition, int gridChildPosition) {
    java.lang.String date = expandableGridAdapter.getData(gridGroupPosition, gridChildPosition);
    android.widget.Toast.makeText(this, ((("p:" + gridGroupPosition) + ",c:") + gridChildPosition), Toast.LENGTH_SHORT).show();
}