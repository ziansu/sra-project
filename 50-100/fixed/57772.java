@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    es.rgmf.libresportgps.file.FileManager.delete((((es.rgmf.libresportgps.common.Session.getAppFolder()) + "/") + (mTrack.getId())));
    if (!(es.rgmf.libresportgps.db.DBModel.deleteTrack(getActivity(), mTrack.getId())))
        android.widget.Toast.makeText(getActivity(), R.string.track_was_not_deleted, Toast.LENGTH_LONG).show();
    
    getFragmentManager().popBackStack();
}