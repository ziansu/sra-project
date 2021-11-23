@java.lang.Override
public final boolean resetChildFilter(@android.support.annotation.NonNull
final java.lang.String query, final int flags) {
    boolean result = true;
    boolean emptyGroupFilterApplied = isGroupFilterApplied("", Group.FLAG_FILTER_EMPTY_GROUPS);
    resetGroupFilter("", Group.FLAG_FILTER_EMPTY_GROUPS);
    for (int i = 0; i < (de.mrapp.android.adapter.expandablelist.filterable.AbstractFilterableExpandableListAdapter.getGroupCount()); i++) {
        result &= resetChildFilter(i, query, flags, (emptyGroupFilterApplied && (i == ((de.mrapp.android.adapter.expandablelist.filterable.AbstractFilterableExpandableListAdapter.getGroupCount()) - 1))));
    }
    return result;
}