private void reloadAll() {
    switch (selectedNav) {
        case ZConstants.NAV_DASHBOARD :
            execDashboard();
            break;
        case ZConstants.NAV_ALL_BOOKS :
            execAllBooks();
            break;
        case ZConstants.NAV_READ_BOOK :
            break;
        case ZConstants.NAV_DISCOVER_BOOK :
            break;
        case ZConstants.NAV_FAVORITES :
            execFavorite();
            break;
    }
}