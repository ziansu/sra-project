public void setSortOrder(com.ivanmagda.habito.models.HabitList.SortOrder sortOrder) {
    if (mSortOrder.equals(sortOrder)) {
        this.mSortOrder = sortOrder;
        sort();
    }
}