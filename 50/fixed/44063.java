public int getIndexOfFirstElement() {
    return (this.elements) == (visibleElements) ? 0 : java.lang.Math.round(((elements) * (scrollPos)));
}