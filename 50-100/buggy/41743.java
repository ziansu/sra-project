public int findSectionIndex(int cID) {
    int i;
    com.example.ryan.testapplications.section s;
    if ((sections.size()) != 0) {
        for (i = 0; i < (sections.size()); i++) {
            s = ((com.example.ryan.testapplications.section) (sections.get(i)));
            if (cID == (s.getCourseID())) {
                return i;
            }
            return -1;
        }
    }
    return -1;
}