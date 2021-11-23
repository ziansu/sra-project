public void onClick(android.content.DialogInterface dialog, int id) {
    com.taibah.busservice.utils.Helpers.showProgressDialog(getActivity(), "Ending Route");
    com.taibah.busservice.utils.DriverService.onLocationChangedCounter = 0;
    new com.taibah.busservice.utils.UpdateRouteStatus(getActivity()).execute("status=0");
    new com.taibah.busservice.fragments.Handler().postDelayed(new java.lang.Runnable() {
        public void run() {
            buttonStartStopRoute.setText("Start Route");
            com.taibah.busservice.utils.Helpers.dismissProgressDialog();
            getActivity().stopService(new android.content.Intent(getActivity(), com.taibah.busservice.utils.DriverService.class));
        }
    }, 2000);
}