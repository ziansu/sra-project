private boolean isSignedToCourse(java.lang.String courseId) {
    for (int i = 0; i < (data.size()); i++) {
        if (data.get(i).id.equals(courseId))
            return true;
        
    }
    return false;
}