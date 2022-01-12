@java.lang.Override
public com.paaltao.Adapters.CategoryAdapter.CategoryHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    inflater = android.view.LayoutInflater.from(parent.getContext());
    view = inflater.inflate(R.layout.category_card, parent, false);
    com.paaltao.Adapters.CategoryAdapter.CategoryHolder holder = new com.paaltao.Adapters.CategoryAdapter.CategoryHolder(view);
    return holder;
}