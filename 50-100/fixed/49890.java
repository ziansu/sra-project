@java.lang.Override
public boolean equals(final java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }
    if ((obj == null) || ((getClass()) != (obj.getClass()))) {
        return false;
    }
    final com.spotify.docker.client.messages.Event.Actor that = ((com.spotify.docker.client.messages.Event.Actor) (obj));
    return (java.util.Objects.equals(this.id, that.id)) && (java.util.Objects.equals(this.attributes, that.attributes));
}