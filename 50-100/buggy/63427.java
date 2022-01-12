@java.lang.Override
public void onReadyStateChange(com.byteshaft.requests.HttpRequest httpRequest, int i) {
    switch (i) {
        case com.byteshaft.requests.HttpRequest.STATE_DONE :
            android.util.Log.i("URL", httpRequest.getResponseURL());
            switch (httpRequest.getStatus()) {
                case java.net.HttpURLConnection.HTTP_OK :
                    com.byteshaft.medicosperuanos.utils.Helpers.showSnackBar(getView(), getResources().getString(R.string.schedule_updated));
                    getSchedule(currentDate);
                    android.util.Log.i("Update", httpRequest.getResponseText());
            }
    }
}