classscheduling.Course fillSlotWithCourse(classscheduling.Slot slot, classscheduling.Course c) {
    classscheduling.Course result = c;
    errors.clear();
    try {
        enoughPeriodsPerWeek(c);
    } catch (classscheduling.ValidationException ve) {
    }
    if (errors.isEmpty()) {
        result = fillSlotWithNextAvailableCourse(slot);
    }else {
        fillSlot(slot, c);
    }
    return result;
}