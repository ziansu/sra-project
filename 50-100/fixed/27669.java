public void requestRide(android.view.View view) {
    if (requestActive) {
        requestActive = false;
        downloadTaskType = "cancelRequest";
        android.util.Log.i("Rider Map", "Ride Cancelled");
        com.akashbhave.locomoto.YourLocation.DownloadTask cancelRequestTask = new com.akashbhave.locomoto.YourLocation.DownloadTask();
        cancelRequestTask.execute("");
    }else {
        requestStatusView.setVisibility(View.VISIBLE);
        downloadTaskType = "request";
        android.util.Log.i("Rider Map", "Ride Requested");
        com.akashbhave.locomoto.YourLocation.DownloadTask requestRideTask = new com.akashbhave.locomoto.YourLocation.DownloadTask();
        requestRideTask.execute("");
    }
}