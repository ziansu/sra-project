@java.lang.Override
public java.lang.String toString() {
    switch (type) {
        case INCHES :
            return ((value) / (calculator.Parser.PT_PER_IN)) + " in";
        case POINTS :
            return (value) + " pt";
        default :
            return "" + (value);
    }
}