private void inflate(android.view.LayoutInflater inflater) {
    mainLayout = ((android.widget.RelativeLayout) (inflater.inflate(R.layout.calculation_fragment_layout, null)));
    seekBar = ((android.widget.SeekBar) (mainLayout.findViewById(R.id.seekBar)));
    editText = ((android.widget.EditText) (mainLayout.findViewById(R.id.editText)));
    detailsButton = ((android.widget.Button) (mainLayout.findViewById(R.id.buttonGetDetails)));
    listView = ((it.sephiroth.android.library.widget.HListView) (mainLayout.findViewById(R.id.horizontalListView)));
}