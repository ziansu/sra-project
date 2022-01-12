@java.lang.Override
public void onBindViewHolder(acodexm.futuremindapp.ContentListAdapter.RepoViewHolder holder, int position) {
    acodexm.futuremindapp.DataRepo repo = mData.get(position);
    holder.mTitle.setText(repo.getTitle());
    holder.mDesc.setText(repo.getDescription());
    holder.mDate.setText(repo.getModificationDate());
    it.sephiroth.android.library.picasso.Picasso.with(mContext).load(repo.getImageUrl()).into(holder.mImage);
    holder.mDataRepo = repo;
}