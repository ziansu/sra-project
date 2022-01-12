@java.lang.Override
public int compare(com.sonymobile.tools.gerrit.gerritevents.dto.events.GerritTriggeredEvent o1, com.sonymobile.tools.gerrit.gerritevents.dto.events.GerritTriggeredEvent o2) {
    if ((o1 == null) && (o2 == null)) {
        return 0;
    }
    if ((o1 != null) && (o2 == null)) {
        return 1;
    }
    if ((o1 == null) && (o2 != null)) {
        return -1;
    }
    return new java.lang.Integer(o1.hashCode()).compareTo(o2.hashCode());
}