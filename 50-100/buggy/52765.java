@java.lang.Override
public void processFinish(java.lang.String output) {
    abfrageStartzeit = false;
    boolean noerror = true;
    try {
        de.ackermann.eric.androidconnectorapphttp.ConnectionActivity.startzeit = java.lang.Long.parseLong(output);
    } catch (java.lang.NumberFormatException e) {
        de.ackermann.eric.androidconnectorapphttp.ConnectionActivity.CONNECTION_ERROR = true;
        java.lang.System.out.println((output + " ist keine long."));
        noerror = false;
        android.widget.Toast.makeText(context, "Der Wettkampf ist noch nicht gestartet und Sie können noch keine Zeiten eintragen oder ein Netzwerkfehler ist aufgetreten. Bitte überprüfen Sie Ihre Netzwerkverbindung und versuchen Sie es später erneut!", Toast.LENGTH_LONG).show();
    }
    java.lang.System.out.println(("Startzeit: " + (de.ackermann.eric.androidconnectorapphttp.ConnectionActivity.startzeit)));
    if (noerror) {
        startActivity(new android.content.Intent(context, de.ackermann.eric.androidconnectorapphttp.MainActivity.class));
    }
}