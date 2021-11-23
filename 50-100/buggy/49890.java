@java.lang.Override
public boolean equals(final java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if ((o == null) || ((getClass()) != (o.getClass()))) {
        return false;
    }
    final com.spotify.docker.client.messages.Event.Actor that = ((com.spotify.docker.client.messages.Event.Actor) (o));
    return (java.util.Objects.equals(this.id, that.id)) && (java.util.Objects.equals(this.attributes, that.attributes));
}