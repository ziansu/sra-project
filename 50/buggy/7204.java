void updatePageNumber() {
    while (((pageNumber) * (pageLength)) >= (pagedDataProvider.getBackendSize())) {
        --(pageNumber);
    } 
}