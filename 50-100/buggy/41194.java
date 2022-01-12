void setReadTimeout(int time, java.lang.Integer itemKey) {
    getContext().system().scheduler().scheduleOnce(scala.concurrent.duration.Duration.create(time, java.util.concurrent.TimeUnit.SECONDS), getSelf(), new Message.ReadTimeout(itemKey), getContext().system().dispatcher(), getSelf());
}