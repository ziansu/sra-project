public hr.fer.zemris.nenr.fuzzy.DomainElement elementForIndex(int index) {
    int i = 0;
    for (hr.fer.zemris.nenr.fuzzy.DomainElement element : this) {
        if (i == index) {
            return element;
        }
    }
    throw new java.lang.IndexOutOfBoundsException();
}