@java.lang.Override
public void handle(uk.ac.ucl.excites.sapelli.transmission.modes.http.HTTPTransmission httpT) {
    uk.ac.ucl.excites.sapelli.transmission.db.TransmissionStore.TRANSMISSION_COLUMN_RECEIVER.storeValue(tRec, httpT.getReceiverURL());
    uk.ac.ucl.excites.sapelli.transmission.db.TransmissionStore.TRANSMISSION_COLUMN_NUMBER_OF_PARTS.storeValue(tRec, 1);
    uk.ac.ucl.excites.sapelli.storage.model.Record tPartRec = newPartRecord();
    uk.ac.ucl.excites.sapelli.transmission.db.TransmissionStore.TRANSMISSION_PART_COLUMN_NUMBER.storeValue(tPartRec, 1L);
    setPartBody(httpT.getBody());
}