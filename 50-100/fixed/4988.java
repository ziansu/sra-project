public void init(com.sarmento.mitchell.gradesaver2.model.DueDate dueDate, int termPosition, int sectionPosition, int dueDatePosition) {
    this.dueDate = dueDate;
    this.termPosition = termPosition;
    this.sectionPosition = sectionPosition;
    this.dueDatePosition = dueDatePosition;
    complete = dueDate.isComplete();
    daysRemaining = getDaysRemaining(dueDate.getDate());
    setButtonText();
    setButtonColor();
    if (!(academics.inArchive())) {
        setOnClickListener(this);
        setOnLongClickListener(this);
    }
}