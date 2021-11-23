@java.lang.Override
public java.lang.String getItem(int position) {
    android.util.Log.e("SchoolIDItem", ("" + (cityZipList.get(position).get("sch_id"))));
    return cityZipList.get(position).get("sch_id");
}