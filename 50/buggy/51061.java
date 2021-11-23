public void removeFinishDate() {
    filter.setFinishDate(null);
    endDate = null;
    interviews = getInterviewsWithFilter();
}