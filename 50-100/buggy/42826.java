public java.util.List<model.Search> getRecommendingRooms(int hotelId) {
    sqlwhere.core.Where where = new sqlwhere.core.Where(new sqlwhere.operators.logical.And(new sqlwhere.operators.compare.NotNull(Columns.View.SearchView.RECOMMENDED), new sqlwhere.operators.compare.GreaterThan(Columns.View.SearchView.RECOMMENDED, 0))).and(new sqlwhere.operators.compare.Equal(Columns.View.SearchView.HOTEL_ID, hotelId)).and(new sqlwhere.operators.compare.Null(Columns.View.SearchView.BELONGS_TO));
    return searchDAO.search(where);
}