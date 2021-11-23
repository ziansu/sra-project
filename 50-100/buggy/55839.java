@java.lang.Override
public boolean hasNext() {
    if (terminated) {
        return false;
    }
    if (currentPage.hasNext()) {
        return true;
    }
    currentPage = computeNextPage();
    if (currentPage.hasNext()) {
        terminated = true;
        return false;
    }
    return true;
}