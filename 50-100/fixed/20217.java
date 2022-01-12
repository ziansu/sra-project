@java.lang.Override
public void onBindViewHolder(mgproject.inftel.mgproject.recyclerView.RecyclerViewAdapter.ViewHolder holder, int position) {
    holder.mTextView.setText(projectList.get(position).getNameProject());
    if (projectList.get(position).getAdminProject().getIdGoogleUser().equals(mgproject.inftel.mgproject.activities.MGApp.getmInstance().getUser().getIdGoogleUser())) {
        holder.mImageView.setImageResource(R.drawable.ic_person_black_24dp);
    }else {
    }
}