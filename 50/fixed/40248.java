private void setUnionAdapter() {
    unionSpinnerAdapter = new com.binarycraft.acland.adapter.SpinnerAdapter(context, R.layout.spinner_row, union_names);
    mbsUnion.setAdapter(unionSpinnerAdapter);
    unionSpinnerAdapter.notifyDataSetChanged();
}