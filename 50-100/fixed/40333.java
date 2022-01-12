public void setCurrentFilterFrom(sergeylysyi.notes.note.NoteSaver.QueryFilter filter) {
    currentFilter.sortField = ((filter.sortField) != null) ? filter.sortField : currentFilter.sortField;
    currentFilter.sortOrder = ((filter.sortOrder) != null) ? filter.sortOrder : currentFilter.sortOrder;
    currentFilter.dateField = ((filter.dateField) != null) ? filter.dateField : currentFilter.dateField;
    currentFilter.after = ((filter.after) != null) ? filter.after : currentFilter.after;
    currentFilter.before = ((filter.before) != null) ? filter.before : currentFilter.before;
}