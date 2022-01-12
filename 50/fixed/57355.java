int getNumRecords() {
    if ((response) != null) {
        return response.getSearchHit().size();
    }else {
        return 0;
    }
}