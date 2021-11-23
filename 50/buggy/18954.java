@java.lang.Override
public com.rutvik.bhagwatiholidays.LazyAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View vi = inflater.inflate(R.layout.offers_list_item, null);
    com.rutvik.bhagwatiholidays.LazyAdapter.ViewHolder vh = new com.rutvik.bhagwatiholidays.LazyAdapter.ViewHolder(vi);
    return vh;
}