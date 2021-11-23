public boolean replace(ScheduleElement oldElement, ScheduleElement newElement) {
    if (!(this.checkOverload(newElement))) {
        int i = this.elements.indexOf(oldElement);
        this.elements.set(i, newElement);
        return true;
    }else {
        return false;
    }
}