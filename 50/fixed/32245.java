@java.lang.Override
public java.lang.String toString() {
    switch (type) {
        case INCHES :
            return (value) + " in";
        case POINTS :
            return (value) + " pt";
        default :
            return "" + (value);
    }
}