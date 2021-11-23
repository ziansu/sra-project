@java.lang.Override
public int compare(dev.blunch.blunch.domain.Menu lhs, dev.blunch.blunch.domain.Menu rhs) {
    return lhs.getDateStart().compareTo(rhs.getDateStart());
}