public final co.paralleluniverse.actors.Actor link(co.paralleluniverse.actors.ActorRef other) {
    final co.paralleluniverse.actors.ActorImpl other1 = co.paralleluniverse.actors.ActorImpl.getActorRefImpl(other);
    record(1, "Actor", "link", "Linking actors %s, %s", this, other1);
    if (this.isDone()) {
        other1.getLifecycleListener().dead(ref, getDeathCause());
    }else {
        observed.add(other);
        addLifecycleListener(other1.getLifecycleListener());
        other1.linked(myRef());
    }
    return this;
}