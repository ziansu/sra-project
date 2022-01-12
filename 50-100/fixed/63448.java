@java.lang.Override
public void success(com.getataxi.mobiletaxi.comm.models.OrderDetailsDM orderDetailsDM, retrofit.client.Response response) {
    int status = response.getStatus();
    if (status == (org.apache.http.HttpStatus.SC_OK)) {
        clearStoredOrder();
        toggleButton(com.getataxi.mobiletaxi.OrderMap.ButtonType.Place);
        taxi.onDuty = true;
        taxi.isAvailable = true;
        reportTaxiStatus(taxi);
    }
    showProgress(false);
}