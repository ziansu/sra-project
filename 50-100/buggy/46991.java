@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if (!(o instanceof no.api.regurgitator.storage.ServerResponseKey)) {
        return false;
    }
    final no.api.regurgitator.storage.ServerResponseKey that = ((no.api.regurgitator.storage.ServerResponseKey) (o));
    if ((requestMethod) != (that.requestMethod)) {
        return false;
    }
    if (!(requestURI.equals(that.requestURI))) {
        return false;
    }
    return true;
}