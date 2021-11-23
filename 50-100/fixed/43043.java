@java.lang.Override
public void onClick(android.view.View view) {
    org.hisp.dhis.android.dataentry.selection.SelectionViewModel model = ((org.hisp.dhis.android.dataentry.selection.SelectionViewModel) (view.getTag()));
    if (model != null) {
        android.content.Intent result = new android.content.Intent();
        result.putExtra(org.hisp.dhis.android.dataentry.selection.SelectionDialogFragment.SELECTION_RESULT, model);
        getTargetFragment().onActivityResult(getTargetRequestCode(), org.hisp.dhis.android.dataentry.selection.SelectionDialogFragment.RESULT_CODE, result);
        this.dismiss();
    }
}