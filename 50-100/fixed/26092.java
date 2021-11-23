@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.ckt.ckttodo.database.Project project = null;
    if (section == 0) {
        project = mDataOwner.get(position);
    }else {
        mDataJoin.get(position);
    }
    doDeleteRequest(project, section);
}