public void setCurrentFilterFrom(sergeylysyi.notes.note.NoteSaver.QueryFilter filter) {
    currentFilter.sortField = ((filter.sortField) != null) ? filter.sortField : defaultFilter.sortField;
    currentFilter.sortOrder = ((filter.sortOrder) != null) ? filter.sortOrder : defaultFilter.sortOrder;
    currentFilter.dateField = ((filter.dateField) != null) ? filter.dateField : defaultFilter.dateField;
    currentFilter.after = ((filter.after) != null) ? filter.after : defaultFilter.after;
    currentFilter.before = ((filter.before) != null) ? filter.before : defaultFilter.before;
}