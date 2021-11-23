@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }
    if (!(obj instanceof no.api.regurgitator.storage.ServerResponseKey)) {
        return false;
    }
    final no.api.regurgitator.storage.ServerResponseKey that = ((no.api.regurgitator.storage.ServerResponseKey) (obj));
    if ((requestMethod) != (that.requestMethod)) {
        return false;
    }
    if (!(requestURI.equals(that.requestURI))) {
        return false;
    }
    return true;
}