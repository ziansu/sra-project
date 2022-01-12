@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    adapter = new com.company.wishlist.adapter.WishListAdapter(getContext());
    android.support.v7.widget.RecyclerView recyclerView = ((android.support.v7.widget.RecyclerView) (view.findViewById(R.id.recyclerView)));
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getContext()));
    recyclerView.setAdapter(adapter);
}