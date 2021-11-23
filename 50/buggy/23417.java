java.lang.Boolean isStaffAvailable() {
    return (parentCoordinator.getAvailableStaffNumber()) > 0 ? true : false;
}