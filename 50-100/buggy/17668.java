@java.lang.Override
public android.view.View getView(final int position, final android.view.View convertView, final android.view.ViewGroup parent) {
    final android.widget.TextView ret;
    if (convertView == null) {
        final android.view.LayoutInflater inflater = android.view.LayoutInflater.from(context);
        ret = ((android.widget.TextView) (inflater.inflate(R.layout.item_autocomplete_text, parent, false)));
    }else {
        ret = ((android.widget.TextView) (convertView));
    }
    final com.monits.agilefant.model.FilterableIteration iteration = getItem(position);
    ret.setText(iteration.getName());
    return ret;
}