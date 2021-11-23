@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolderImpl(android.view.ViewGroup viewGroup, com.poliveira.parallaxrecyclerview.ParallaxRecyclerAdapter parallaxRecyclerAdapter, int i) {
    android.view.View v = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_typical, viewGroup, false);
    opzioni = it.angelic.soulissclient.SoulissClient.getOpzioni();
    opzioni.reload();
    return new it.angelic.soulissclient.adapters.ParallaxExenderAdapter.ViewHolder(v);
}