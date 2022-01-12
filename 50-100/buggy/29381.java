public boolean save() {
    android.util.Log.i(sne.workorganizer.EditWorkFragment.TAG, "save() called");
    if (validateFields())
        return false;
    
    fillWork();
    sne.workorganizer.db.Picture pict = new sne.workorganizer.db.Picture();
    pict.setWorkId(_work.getId());
    pict.setResultPhoto(_resultPath);
    sne.workorganizer.db.DatabaseHelper db = sne.workorganizer.db.DatabaseHelper.getInstance(getActivity());
    db.updateWork(_work, true);
    db.updatePicture(pict);
    return true;
}