@java.lang.Override
public com.paaltao.Adapters.CategoryAdapter.CategoryHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    inflater = android.view.LayoutInflater.from(parent.getContext());
    view = inflater.inflate(R.layout.category_card, parent, false);
    com.paaltao.Adapters.CategoryAdapter.CategoryHolder holder = new com.paaltao.Adapters.CategoryAdapter.CategoryHolder(view);
    holder.categoryImage.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            android.content.Intent intent = new android.content.Intent(activity, com.paaltao.activity.ProductListActivity.class);
            activity.startActivity(intent);
        }
    });
    return holder;
}