@java.lang.Override
public int compare(dev.blunch.blunch.domain.Menu lhs, dev.blunch.blunch.domain.Menu rhs) {
    return rhs.getDateStart().compareTo(lhs.getDateStart());
}