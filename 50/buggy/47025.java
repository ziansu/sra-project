public boolean setEnrollmentLimit(int limit) {
    if ((enrolledStudents.size()) == 0) {
        this.enrollLimit = limit;
        return true;
    }
    return false;
}