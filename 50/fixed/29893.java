public unrealwar.assignment2.Student get(int position) {
    if ((position >= (students.size())) || (position < 0)) {
        return null;
    }
    return students.get(position);
}