@java.lang.Override
public boolean toBeRemoved() {
    return !((getResourcesLeft()) > 0);
}