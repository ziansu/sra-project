@java.lang.Override
public net.chokethe.killerdealer.adapters.BlindsAdapter.BlindViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(mContext).inflate(R.layout.blind_layout, parent, false);
    return new net.chokethe.killerdealer.adapters.BlindsAdapter.BlindViewHolder(view, new net.chokethe.killerdealer.adapters.BlindsAdapter.BlindEditTextListener());
}