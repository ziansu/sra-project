@java.lang.Override
public int compare(com.artemis.Entity entityA, com.artemis.Entity entityB) {
    return ((int) (java.lang.Math.signum(((getY(entityA)) - (getY(entityB))))));
}