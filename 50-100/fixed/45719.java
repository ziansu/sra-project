protected org.apache.wicket.extensions.markup.html.repeater.data.sort.OrderByLink<S> newOrderByLink(final java.lang.String id, final S property, final org.apache.wicket.extensions.markup.html.repeater.data.sort.ISortStateLocator<S> stateLocator) {
    return new org.apache.wicket.extensions.markup.html.repeater.data.sort.OrderByLink<S>(id, property, stateLocator) {
        private static final long serialVersionUID = 1L;

        @java.lang.Override
        protected void onSortChanged() {
            de.agilecoders.wicket.extensions.markup.html.bootstrap.table.sort.BootstrapOrderByBorder.this.onSortChanged();
        }
    };
}