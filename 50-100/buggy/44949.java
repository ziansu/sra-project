public void removeDuplicateStudents() {
    java.util.ArrayList<java.lang.String> names = new java.util.ArrayList<java.lang.String>();
    for (int i = (this.size()) - 1; i >= 0; i++) {
        JavaStudent st = this.get(i);
        if (names.contains(st.getName()));
        {
            this.remove(i);
        }
    }
}