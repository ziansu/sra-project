public boolean hasUrgentItems(usr.doetsch.supertodo.List list) {
    if (hasSubLists(list)) {
        for (usr.doetsch.supertodo.List sublist : list) {
            if ((sublist.isUrgent()) || (hasUrgentItems(sublist))) {
                return true;
            }
        }
        return false;
    }else {
        return list.isUrgent();
    }
}