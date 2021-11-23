public void showMenu() {
    if (!(isMenuShown)) {
        this.smoothScrollTo(0, 0);
        isMenuShown = true;
    }
}