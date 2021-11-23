private static int getAspectPoints(java.util.ArrayList<com.backend.models.SchoolInteger> aspect, com.backend.models.School school) {
    int indexOf = aspect.indexOf(school);
    if (indexOf == (-1)) {
        return 0;
    }
    return ((aspect.size()) - indexOf) + 1;
}