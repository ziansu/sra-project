@java.lang.Override
public util.navigation.adapter.FotosLocalAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.support.v7.widget.CardView v = ((android.support.v7.widget.CardView) (android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.cartas, parent, false)));
    util.navigation.adapter.FotosLocalAdapter.ViewHolder vh = new util.navigation.adapter.FotosLocalAdapter.ViewHolder(v, basket, this);
    return vh;
}