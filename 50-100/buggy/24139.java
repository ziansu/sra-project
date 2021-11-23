private void ensureCapacity() {
    if ((edu.cpp.cs.cs240.prog_assgmnt_3.UnboundedList.size()) == (values.length)) {
        java.lang.Object[] newArray = new java.lang.Object[(values.length) * 2];
        for (int i = 0; i < (values.length); i++) {
            newArray[i] = values[(i + ((start) % (values.length)))];
        }
        start = 0;
        nextEmpty = values.length;
        values = newArray;
    }
}