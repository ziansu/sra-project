@java.lang.Override
public boolean start() throws java.io.IOException {
    java.lang.String jsonResult = rest.get(resource);
    if ((jsonResult != null) && (!(jsonResult.isEmpty()))) {
        return true;
    }
    return false;
}