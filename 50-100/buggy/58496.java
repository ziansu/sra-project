@java.lang.Override
public void onClick(android.view.View view) {
    avia.androi.innopolis.com.aviasales.models.responses.FlightRequest request = new avia.androi.innopolis.com.aviasales.models.responses.FlightRequest();
    request.setCityFrom("Moscow");
    request.setCityTo("Tokio");
    request.setDateDeparture(1468935531506L);
    request.setDateBackReturn(1469197800000L);
    request.setRoundTrip(false);
    seachPresenter.search(request);
}