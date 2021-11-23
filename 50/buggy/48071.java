public boolean hasSuccess() {
    return (!(added.isEmpty())) || (!(removed.isEmpty())) ? true : false;
}