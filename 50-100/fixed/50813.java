public ua.lesson.lessons.Pet searchByPetNameAndType(java.lang.String petName, java.lang.String petType) {
    ua.lesson.lessons.Pet result = new ua.lesson.lessons.Pet("Null", "Null");
    for (ua.lesson.lessons.Pet p : petsList)
        if ((p.getName().equals(petName)) && (p.getType().equals(petType))) {
            result = p;
            break;
        }
    
    return result;
}