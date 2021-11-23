@java.lang.Override
public void onLocationAvailability(com.google.android.gms.location.LocationAvailability locationAvailability) {
    super.onLocationAvailability(locationAvailability);
    if (!(locationAvailability.isLocationAvailable())) {
        if (((br.edu.ufcg.analytics.meliorbusao.activities.MelhorBusaoActivity.requestingLocationDialog) != null) && (br.edu.ufcg.analytics.meliorbusao.activities.MelhorBusaoActivity.requestingLocationDialog.isShowing())) {
            br.edu.ufcg.analytics.meliorbusao.activities.MelhorBusaoActivity.requestingLocationDialog.dismiss();
        }
        android.widget.Toast.makeText(getApplicationContext(), getString(R.string.fail_retrieving_location), Toast.LENGTH_SHORT).show();
        android.util.Log.d("OnLocationAvailability", "Não foi possível localizar");
    }
}