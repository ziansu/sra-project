private void calculateScrolltabHeight() {
    if ((elements) > (visibleElements)) {
        this.scrollTabHeight = ((float) (visibleElements)) / ((float) (elements));
    }else {
        scrollTabHeight = 1;
    }
}