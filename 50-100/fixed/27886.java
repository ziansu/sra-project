public void startRequestProcess() {
    if (((mAdapter) != null) && (((mAdapter.getSelectedApps()) != null) && ((mAdapter.getSelectedApps().size()) <= 0))) {
        try {
            jahirfiquitiva.iconshowcase.dialogs.ISDialogs.showNoSelectedAppsDialog(getActivity());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }else {
        showRequestsFilesCreationDialog(getActivity());
    }
}