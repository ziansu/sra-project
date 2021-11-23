@java.lang.Override
public boolean isValid() {
    return ((man.distanceTo()) < 2) || (!(man.getInteractingCharacter().equals(org.rev317.min.api.methods.Players.getMyPlayer())));
}