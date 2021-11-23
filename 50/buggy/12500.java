protected void fillFirstPage(final com.commercetools.sunrise.search.pagination.viewmodels.PaginationViewModel viewModel, final io.sphere.sdk.queries.PagedResult<?> pagedResult) {
    final long totalPages = calculateTotalPages(pagedResult);
    if (firstPageIsDisplayed(totalPages)) {
        viewModel.setFirstPage(createLinkData(1));
    }
}