public void pickGroup() {
    setStatus(WindowStatuses.BUSY.toString());
    main.model.GroupOfPassengers temporaryGroupOfPassengers = taxiData.getPassengerQueue().popGroup();
    try {
        java.lang.Thread.sleep(main.utils.Utils.getIntBetween(2000, 2000));
    } catch (java.lang.InterruptedException e) {
    }
    setGroupOfPassengers(temporaryGroupOfPassengers);
    if (temporaryGroupOfPassengers != null) {
        setRemainingNumberOfPassengers(temporaryGroupOfPassengers.getNumberOfPassengers());
    }
}