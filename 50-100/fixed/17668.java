@java.lang.Override
public android.view.View getView(final int position, final android.view.View convertView, final android.view.ViewGroup parent) {
    final android.widget.TextView ret;
    if (convertView instanceof android.widget.TextView) {
        ret = ((android.widget.TextView) (convertView));
    }else {
        final android.view.LayoutInflater inflater = android.view.LayoutInflater.from(context);
        ret = ((android.widget.TextView) (inflater.inflate(R.layout.item_autocomplete_text, parent, false)));
    }
    final com.monits.agilefant.model.FilterableIteration iteration = getItem(position);
    ret.setText(iteration.getName());
    return ret;
}