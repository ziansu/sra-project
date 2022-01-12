@java.lang.Override
public void onBindViewHolder(com.android4devs.navigationdrawer.MyAdapter.ViewHolder holder, int position) {
    if ((holder.Holderid) == 1) {
        holder.textView.setText(mNavTitles[(position - 1)]);
        holder.imageView.setImageResource(mIcons[(position - 1)]);
        android.util.Log.d("BiPin", mNavTitles[holder.Holderid]);
    }else {
        holder.profile.setImageResource(profile);
        holder.Name.setText(name);
        holder.email.setText(email);
    }
}