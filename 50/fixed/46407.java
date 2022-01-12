private android.net.Uri insertActorValues(android.content.ContentValues actorValues) {
    android.util.Log.v(com.harlie.radiotheater.radiomysterytheater.data.TestRadioTheaterDb.TAG, "insertActorValues");
    android.net.Uri actor = RadioTheaterContract.ActorsEntry.buildActorsUri();
    return context.getContentResolver().insert(actor, actorValues);
}