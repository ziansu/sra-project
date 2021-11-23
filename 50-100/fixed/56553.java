public edu.wisc.my.portlets.dmp.beans.MenuItem getMenu(java.lang.String menuName, java.lang.String[] userGroups) {
    final edu.wisc.my.portlets.dmp.beans.MenuItem menuItem = this.delegateMenuDao.getMenu(menuName);
    if (null == menuItem) {
        return null;
    }
    if (menuItem.hasMatchingGroup(userGroups)) {
        return new edu.wisc.my.portlets.dmp.dao.filter.FilteringMenuItem(menuItem, userGroups);
    }
    return null;
}