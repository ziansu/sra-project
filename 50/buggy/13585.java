public void addObserver(br.com.apuri.manager.ApuriConnectionManager.ApuriConnectionObserver observer) {
    if (!(this.observers.contains(observer)))
        this.observers.add(observer);
    
}