@android.databinding.BindingAdapter(value = { "bind:layout_manager" })
public void setLayoutManager(final android.support.v7.widget.RecyclerView rv, final android.support.v7.widget.RecyclerView.LayoutManager lm) {
    if ((rv.getLayoutManager()) == null) {
        rv.setLayoutManager(lm);
    }
}