private void showWrapperInView(com.alesarcode.whatwatch.domain.model.ModelWrapper wrapper) {
    int startRow = ((wrapper.getPage()) - 1) * (mRowsPerPage);
    this.mView.add(com.alesarcode.whatwatch.presentation.converters.DomainToPresentationConverter.convertToModelList(wrapper.getResultsList()), startRow, wrapper.getTotalCount());
}