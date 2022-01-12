public ua.lesson.lessons.Pet searchByPetName(java.lang.String petName) {
    ua.lesson.lessons.Pet result = new ua.lesson.lessons.Pet("Null", "Null");
    for (ua.lesson.lessons.Pet p : petsList)
        if ((p.getName()) == petName) {
            result = p;
            break;
        }
    
    return result;
}