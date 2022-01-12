public java.util.List<partypeople.Event> getCreated() {
    java.util.List<partypeople.Event> created = new java.util.ArrayList<partypeople.Event>();
    if ((this.myCreated) != null) {
        for (com.googlecode.objectify.Ref<partypeople.Event> event : myCreated) {
            created.add(event.safeGet());
        }
    }
    return created;
}