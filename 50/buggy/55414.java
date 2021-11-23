@java.lang.Override
public int getItemViewType(int position) {
    return ((hint) != null) && (position == 0) ? fr.ganfra.materialspinner.MaterialSpinner.HintAdapter.HINT_TYPE : mSpinnerAdapter.getItemViewType(position);
}