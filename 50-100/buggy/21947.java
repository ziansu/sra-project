private boolean foundInMeetingLists(java.util.List<schedulercs356.entity.Account> list, schedulercs356.entity.Account account) {
    boolean success = false;
    if (list != null) {
        return success;
    }
    for (schedulercs356.entity.Account a : list) {
        if ((account.getId()) == (a.getId())) {
            success = true;
            break;
        }
    }
    return success;
}