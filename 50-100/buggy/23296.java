@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    if ((inflater) == null)
        inflater = ((android.view.LayoutInflater) (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)));
    
    if (convertView == null)
        convertView = inflater.inflate(R.layout.ticket_overview_row, null);
    
    return convertView;
}