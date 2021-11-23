public void setCurrentActor(com.ayocrazy.easystage.bean.ActorBean currentActor) {
    if ((this.currentActor) != null)
        setValue(this.currentActor.getId(), "debug", "default", false);
    
    setValue(currentActor.getId(), "debug", "default", true);
    this.currentActor = currentActor;
}