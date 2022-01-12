@java.lang.Override
public java.lang.String toString() {
    java.lang.String s = "";
    switch (operation) {
        case REPLACE :
            s = ((("REPLACE(" + (source.toString())) + ",") + (target.toString())) + ")";
            break;
        case DISTRIBUTE :
            s = ((("DISTRIBUTE(" + (source.toString())) + ",") + (target.toString())) + ")";
            break;
    }
    return s;
}