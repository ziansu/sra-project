public boolean containsCourse(int crn) {
    com.github.fantastic_five.Logic.Course dummy = dummyCourse(crn);
    return courseOfferings.contains(dummy);
}