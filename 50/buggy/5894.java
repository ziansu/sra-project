@java.lang.Override
public java.lang.String toMoveString() {
    switch (getActing()) {
        case 1 :
            return null;
        case 2 :
            return null;
        case 3 :
            return getType().toString();
        default :
            return null;
    }
}