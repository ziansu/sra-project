void setReadTimeout(java.lang.Integer itemKey, int time) {
    getContext().system().scheduler().scheduleOnce(scala.concurrent.duration.Duration.create(time, java.util.concurrent.TimeUnit.SECONDS), getSelf(), new Message.ReadTimeout(itemKey), getContext().system().dispatcher(), getSelf());
}