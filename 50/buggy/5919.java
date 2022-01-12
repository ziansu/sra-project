@java.lang.Override
@org.robolectric.annotation.Implementation
public void unbindService(android.content.ServiceConnection conn) {
    if (unbindServiceShouldThrowIllegalArgument) {
        throw new java.lang.IllegalArgumentException();
    }
}