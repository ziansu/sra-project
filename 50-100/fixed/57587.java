protected fr.openwide.core.wicket.more.markup.html.sort.TableSortLink<S> newSortLink(java.lang.String id, final fr.openwide.core.wicket.more.markup.html.repeater.data.table.CoreDataTable<?, S> dataTable, fr.openwide.core.wicket.more.markup.html.sort.model.CompositeSortModel<S> sortModel, org.apache.wicket.extensions.markup.html.repeater.data.table.IColumn<?, S> sortableColumn) {
    return new fr.openwide.core.wicket.more.markup.html.sort.TableSortLink<S>(id, sortModel, sortableColumn.getSortProperty(), dataTable) {
        private static final long serialVersionUID = 1L;

        @java.lang.Override
        protected void refreshOnSort(org.apache.wicket.ajax.AjaxRequestTarget target) {
            target.add(dataTable.getComponentToRefresh());
        }
    };
}