@java.lang.Override
public void onBindViewHolder(com.lpaulino.memetrix.presentation.navigation.NavigationAdapter.NavigationViewHolder holder, int position) {
    com.lpaulino.memetrix.presentation.navigation.NavigationItem navigationItem = mNavigationItems[position];
    holder.itemView.setPressed((navigationItem != (mNavigationItemSelected)));
    if ((navigationItem.getImageResource()) != (com.lpaulino.memetrix.Constants.NO_RESOURCE)) {
        holder.mItemNavigationImageView.setImageDrawable(android.support.v4.content.ContextCompat.getDrawable(holder.itemView.getContext(), navigationItem.getImageResource()));
    }
    holder.mItemNavigationTitleTextView.setText(holder.itemView.getContext().getString(navigationItem.getTitleResource()));
    holder.itemView.setTag(navigationItem);
}