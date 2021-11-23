public final co.paralleluniverse.actors.Actor link(co.paralleluniverse.actors.ActorRef other) {
    final co.paralleluniverse.actors.ActorImpl other1 = co.paralleluniverse.actors.ActorImpl.getActorRefImpl(other);
    record(1, "Actor", "link", "Linking actors %s, %s", this, other1);
    this.linked(other);
    other1.linked(myRef());
    return this;
}