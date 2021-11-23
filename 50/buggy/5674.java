@java.lang.Override
public int compareTo(timeline.Event otherevent) {
    return this.getDate().compareTo(otherevent.getDate());
}