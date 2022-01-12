@java.lang.Override
public boolean isValid() {
    return ((man.distanceTo()) > 0) || (!(man.getInteractingCharacter().equals(org.rev317.min.api.methods.Players.getMyPlayer())));
}