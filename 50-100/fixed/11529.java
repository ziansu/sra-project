public java.lang.String toGhName() {
    java.lang.String groupDelimiter = (isExclusive) ? model.TurboLabel.EXCLUSIVE_DELIM : model.TurboLabel.NONEXCLUSIVE_DELIM;
    java.lang.String groupPrefix = (((getGroup()) == null) || (getGroup().isEmpty())) ? "" : (getGroup()) + groupDelimiter;
    java.lang.String groupAppended = groupPrefix + (getName());
    return groupAppended;
}