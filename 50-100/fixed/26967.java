@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(context, "loading", Toast.LENGTH_SHORT).show();
    com.itstest.textselection.util.NetworkRequest.SimpleJsonRequest(context, new org.json.JSONObject(), (((((com.itstest.textselection.util.NetworkRequest.SongSrc) + "?index=") + (index)) + "&language=") + (com.itstest.textselection.util.CommanMethod.languageCode(lang))), this, RequestCodePodcast, 1);
    (index)++;
}