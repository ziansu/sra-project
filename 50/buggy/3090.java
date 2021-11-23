@java.lang.Override
public int compare(de.pschoepf.naturalbreaks.ValueCountPair o1, de.pschoepf.naturalbreaks.ValueCountPair o2) {
    return ((int) (((o1.getValue()) * 1000) - ((o2.getValue()) * 1000)));
}