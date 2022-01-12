public se.kth.iv1350.model.Inspection getNextInspection() {
    try {
        return this.inspections[((this.currentIndex)++)];
    } catch (java.lang.Exception e) {
        this.currentIndex = 0;
        return null;
    }
}