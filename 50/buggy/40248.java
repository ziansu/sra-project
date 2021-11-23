private void setUnionAdapter() {
    union_names = com.binarycraft.acland.datautil.GetAndSaveData.getNamesFromUnions(unions);
    com.binarycraft.acland.adapter.SpinnerAdapter unionSpinnerAdapter = new com.binarycraft.acland.adapter.SpinnerAdapter(context, R.layout.spinner_row, union_names);
    mbsUnion.setAdapter(unionSpinnerAdapter);
    unionSpinnerAdapter.notifyDataSetChanged();
}