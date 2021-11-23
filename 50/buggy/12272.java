private void reserveSeats(org.spine3.samples.lobby.registration.contracts.OrderUpdated event) {
    final org.spine3.samples.lobby.common.ConferenceId conferenceId = getState().getConferenceId();
    reserveSeats(event.getOrderId(), conferenceId, event.getSeatList());
}