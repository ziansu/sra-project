void fillSlotWithCourse(classscheduling.Slot slot, classscheduling.Course c) {
    errors.clear();
    try {
        enoughPeriodsPerWeek(c);
    } catch (classscheduling.ValidationException ve) {
    }
    if (errors.hasErrors()) {
        fillSlotWithNextAvailableCourse(slot);
    }else {
        fillSlot(slot, c);
    }
}