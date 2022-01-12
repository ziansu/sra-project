@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.installBtn :
            if (!(isPermissionGranted())) {
                showPermissionDialog(this);
                break;
            }
            if (!(isVersionChoosed())) {
                break;
            }
            if (isOnline()) {
                loadExpansionFiles();
            }else {
                showInetRequirementMessage(this);
            }
            break;
    }
}