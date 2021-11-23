public java.time.LocalDate determineMinFinishDate() {
    java.time.LocalDate minFinishDate = determineMinStartDate();
    if ((startDatePicker) != null) {
        minFinishDate = startDatePicker.getValue();
    }
    java.time.LocalDate maxWorkDate = selectMaxWorkDate(dtoObjectEmployees.getId());
    if ((maxWorkDate != null) && (minFinishDate.isBefore(maxWorkDate))) {
        minFinishDate = maxWorkDate;
    }
    if (minFinishDate.isBefore(java.time.LocalDate.now())) {
        minFinishDate = java.time.LocalDate.now();
    }
    return minFinishDate;
}