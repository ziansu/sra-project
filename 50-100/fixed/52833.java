@java.lang.Override
public void onDialogPositiveClick(android.app.DialogFragment dialog, int id, java.lang.String spotName, float spotRating) {
    if (dialog instanceof de.admuc.gruppe12.workingtitle.CreateNewSpotDialog) {
        queuePOI(spotName, spotRating, tempMarker.getPosition());
        if ((tempMarker) != null) {
            tempMarker.remove();
        }
    }else
        if (dialog instanceof de.admuc.gruppe12.workingtitle.SpotDetailDialog) {
            sendRating(id, spotRating);
            android.widget.Toast toast = android.widget.Toast.makeText(getApplicationContext(), ("Rated the spot! : " + spotRating), Toast.LENGTH_SHORT);
            toast.show();
        }
    
}