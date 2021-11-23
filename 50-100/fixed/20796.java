@java.lang.Override
public int compare(com.sanzfdu.cafeteriaetsib.dl.Bocata lhs, com.sanzfdu.cafeteriaetsib.dl.Bocata rhs) {
    if ((lhs.getAntiguedad()) > (rhs.getAntiguedad())) {
        return 1;
    }
    if ((lhs.getAntiguedad()) < (rhs.getAntiguedad())) {
        return -1;
    }
    return 0;
}