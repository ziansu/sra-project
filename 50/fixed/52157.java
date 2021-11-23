public void removeReservation(int resID) {
    this.resIDs.remove(((java.lang.Object) (resID)));
    Framework.deleteReservation(resID);
}