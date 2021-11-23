public boolean isPerformClick() {
    if (!(isPerformClick)) {
        isPerformClick = true;
        return false;
    }else {
        if (isRunning)
            return false;
        else {
            isPerformClick = false;
            return true;
        }
    }
}