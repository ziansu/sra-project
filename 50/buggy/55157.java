@java.lang.Override
public com.orientechnologies.orient.core.record.impl.ODocument next() {
    return hasBeenRead ? null : odoc;
}