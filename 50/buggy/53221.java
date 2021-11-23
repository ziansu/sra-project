public void updateDataSet(int position) {
    android.util.Log.i("Gracker", ("update position =" + position));
    arrayList.remove(position);
    notifyDataSetInvalidated();
    notifyDataSetChanged();
}