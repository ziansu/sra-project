public void assertEqual(java.lang.Object o1, java.lang.Object o2, java.lang.String expression) {
    if (java.util.Objects.equals(o1, o2)) {
        expect(true, ((expression + " == ") + o2));
    }else {
        expect(true, ((expression + " != ") + o2));
    }
}