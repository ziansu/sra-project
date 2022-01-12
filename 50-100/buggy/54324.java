public void rename() {
    for (int A = 0; A < (planets.size()); A++) {
        if (planets.get(A).getName().contains("planet")) {
            planets.get(A).setName((("planet " + A) + 1));
        }
    }
}