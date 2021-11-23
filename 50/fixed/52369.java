@java.lang.Override
@com.avail.descriptor.AvailMethod
com.avail.descriptor.A_String o_LowerCaseString(final com.avail.descriptor.AvailObject object) {
    if (isShared()) {
        synchronized(object) {
            return lowerCaseStringFrom(object);
        }
    }
    return lowerCaseStringFrom(object);
}