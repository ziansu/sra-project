public java.util.ArrayList<uni.project.sd.comunications.battleship.entity.EventListItem> getEventList() {
    synchronized(eventList) {
        return eventList;
    }
}