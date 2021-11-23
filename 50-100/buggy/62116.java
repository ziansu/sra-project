public java.util.List<model.Search> getNonRecommendingRooms(int hotelId) {
    sqlwhere.core.Where where = new sqlwhere.core.Where(new sqlwhere.operators.logical.Or(new sqlwhere.operators.compare.Null(Columns.View.SearchView.RECOMMENDED), new sqlwhere.operators.compare.Equal(Columns.View.SearchView.RECOMMENDED, 0))).and(new sqlwhere.operators.compare.Equal(Columns.View.SearchView.HOTEL_ID, hotelId)).and(new sqlwhere.operators.compare.Null(Columns.View.SearchView.BELONGS_TO));
    return searchDAO.search(where);
}