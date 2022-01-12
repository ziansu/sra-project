private void reserveSeats(org.spine3.samples.lobby.registration.contracts.OrderUpdated event, org.spine3.samples.lobby.common.ConferenceId conferenceId) {
    reserveSeats(event.getOrderId(), conferenceId, event.getSeatList());
}