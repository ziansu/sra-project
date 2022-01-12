@java.lang.Override
public com.sigmobile.dawebmail.adapters.MailAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    if ((context) != null)
        this.inflater = ((android.view.LayoutInflater) (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)));
    
    android.view.View view = inflater.inflate(R.layout.element_email, parent, false);
    return new com.sigmobile.dawebmail.adapters.MailAdapter.ViewHolder(view);
}