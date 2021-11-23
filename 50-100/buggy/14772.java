public synchronized java.util.ArrayList<server.Participant> getCallParticipants(java.util.ArrayList<java.lang.String> callList) {
    java.util.ArrayList<server.Participant> participantToCall = new java.util.ArrayList<server.Participant>();
    for (java.lang.String name : callList) {
        for (server.Participant p : participants) {
            if (name.toLowerCase().equals(p.getName().toLowerCase())) {
                participantToCall.add(p);
            }
        }
    }
    return participantToCall;
}