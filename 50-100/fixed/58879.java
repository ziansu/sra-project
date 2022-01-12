@java.lang.Override
public void setSelectedItem(final int index, final boolean animate) {
    if ((dots.size()) > 0) {
        try {
            if ((selectedDotIndex) < (dots.size())) {
                dots.get(selectedDotIndex).setInactive(animate);
            }
            dots.get(index).setActive(animate);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        selectedDotIndex = index;
    }
}