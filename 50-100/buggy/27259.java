@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent sendIntent = new android.content.Intent();
    sendIntent.setAction(Intent.ACTION_SEND);
    sendIntent.putExtra(Intent.EXTRA_TEXT, ((((("Die Wahlhelfer-App hat mir meine ideale Partei berechnet. \n\n " + "Zu ") + (java.lang.String.valueOf(scores[highest_party_nr]))) + " % bin ich der perfekte ") + (party_favorite)) + "-Wähler"));
    sendIntent.setType("text/plain");
    startActivity(sendIntent);
}