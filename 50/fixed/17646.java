public org.mobicents.servlet.restcomm.entities.ConferenceDetailRecord build() {
    return new org.mobicents.servlet.restcomm.entities.ConferenceDetailRecord(sid, dateCreated, org.joda.time.DateTime.now(), accountSid, status, friendlyName, apiVersion, uri, masterMsId, masterConfernceEndpointId, isMasterPresent, masterIVREndpointId, null);
}