@java.lang.Override
public void onBindViewHolder(final android.support.v7.widget.RecyclerView.ViewHolder vholder, int position1) {
    if (!(this.stoppedAnimation)) {
        animate(((com.amaze.filemanager.adapters.holders.CompressedItemViewHolder) (vholder)));
    }
    if (zipMode)
        onBindViewZip(((com.amaze.filemanager.adapters.holders.CompressedItemViewHolder) (vholder)), position1);
    else
        onBindViewHolderRar(((com.amaze.filemanager.adapters.holders.CompressedItemViewHolder) (vholder)), position1);
    
}