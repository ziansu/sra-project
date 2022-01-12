@java.lang.Override
public void onResponse(retrofit2.Call<social.entourage.android.api.model.map.Tour.TourWrapper> call, retrofit2.Response<social.entourage.android.api.model.map.Tour.TourWrapper> response) {
    if (response.isSuccess()) {
        android.util.Log.d("Success", response.body().getTour().toString());
        tourService.notifyListenersTourClosed(true);
        tour = null;
        pointsToSend.clear();
        pointsToDraw.clear();
        cancelFinishTimer();
        updateLocationServiceFrequency();
    }else {
        tourService.notifyListenersTourClosed(false);
    }
}