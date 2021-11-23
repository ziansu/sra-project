@java.lang.Override
public net.trackmate.model.SpotList subList(final int fromIndex, final int toIndex) {
    return new net.trackmate.model.SpotList(this, getIndexCollection().subList(fromIndex, fromIndex));
}