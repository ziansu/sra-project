private void setUserType(org.trakhound.www.trakhound.device_list.ListAdapter.ViewHolder holder) {
    if ((holder.SelectionArrow) != null) {
        if (((org.trakhound.www.trakhound.MyApplication.User) != null) && ((MyApplication.User.type) > 0))
            holder.SelectionArrow.setVisibility(View.VISIBLE);
        else
            holder.SelectionArrow.setVisibility(View.GONE);
        
    }
    if ((holder.OeeLayout) != null) {
        if (((org.trakhound.www.trakhound.MyApplication.User) != null) && ((MyApplication.User.type) > 0))
            holder.OeeLayout.setVisibility(View.VISIBLE);
        else
            holder.OeeLayout.setVisibility(View.GONE);
        
    }
}