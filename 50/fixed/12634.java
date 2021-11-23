public void setStaticMarks(java.util.List<com.onlylemi.mapview.library.graphics.BaseMark> marks) {
    if (!(marks.isEmpty())) {
        java.util.Collections.copy(this.markObjects, marks);
        this.markObjects.addAll(proxMarks);
    }
}