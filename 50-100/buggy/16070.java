public com.webobjects.foundation.NSArray<org.webcat.grader.Assignment> selectedAssignments() {
    com.webobjects.foundation.NSMutableArray<org.webcat.grader.Assignment> array = new com.webobjects.foundation.NSMutableArray<org.webcat.grader.Assignment>();
    for (java.lang.Object obj : selectedAssignmentModelItems) {
        if (obj instanceof org.webcat.grader.Assignment) {
            array.addObject(obj);
        }
    }
    return array;
}