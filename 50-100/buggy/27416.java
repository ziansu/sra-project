public java.lang.String[] addAdvisory(java.lang.String[] originalCourses) {
    java.lang.String[] newCourses = new java.lang.String[(originalCourses.length) + 1];
    for (int index = 0; index < (newCourses.length); index++) {
        if (index < 2)
            newCourses[index] = originalCourses[index];
        else
            if (index == 2)
                newCourses[2] = "Advisory";
            else
                newCourses[index] = originalCourses[(index + 1)];
            
        
    }
    return newCourses;
}