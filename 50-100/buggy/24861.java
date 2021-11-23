@java.lang.Override
public void onClick(android.view.View view) {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.READ_CONTACTS)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        if (android.support.v4.app.ActivityCompat.shouldShowRequestPermissionRationale(getActivity(), Manifest.permission.READ_CONTACTS)) {
            android.widget.Toast.makeText(getActivity(), "PERMISSION not GRANTED", Toast.LENGTH_SHORT).show();
            return ;
        }else {
            android.support.v4.app.ActivityCompat.requestPermissions(getActivity(), new java.lang.String[]{ Manifest.permission.READ_CONTACTS }, net.jonathanz.android.criminalintent.CrimeFragment.REQUEST_CONTACT_PERMISSION);
        }
    }else {
        startActivityForResult(contact, net.jonathanz.android.criminalintent.CrimeFragment.REQUEST_CONTACT);
    }
}