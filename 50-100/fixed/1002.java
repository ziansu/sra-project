@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null) {
        return false;
    }
    final org.symphonyoss.client.model.Chat other = ((org.symphonyoss.client.model.Chat) (obj));
    if (((this.stream) == null) || (!(this.stream.equals(other.stream)))) {
        return false;
    }
    return true;
}