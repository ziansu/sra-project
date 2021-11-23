public void onGameError() {
    for (com.arinerron.forux.events.EventListener eventListener : this.getEventListeners())
        eventListener.onGameStop();
    
}