@org.junit.Test(expected = org.spine3.samples.lobby.registration.procman.IllegalProcessStateFailure.class)
public void throw_exception_if_handle_OrderPlaced_event_in_inappropriate_state() throws org.spine3.samples.lobby.registration.procman.IllegalProcessStateFailure {
    processManager = given.processManager(State.AWAITING_RESERVATION_CONFIRMATION);
    final org.spine3.samples.lobby.registration.contracts.OrderPlaced event = Given.Event.orderPlaced();
    processManager.on(event, Given.Event.CONTEXT);
}