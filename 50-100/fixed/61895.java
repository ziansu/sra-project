static void updateInactive(me.piebridge.brevent.ui.BreventActivity activity, me.piebridge.brevent.ui.AppsItemViewHolder viewHolder) {
    int inactive = activity.getInactive(viewHolder.packageName);
    if ((viewHolder.inactive) != inactive) {
        viewHolder.inactive = inactive;
        if ((viewHolder.inactive) > 0) {
            viewHolder.inactiveView.setVisibility(View.VISIBLE);
            int elapsed = (me.piebridge.brevent.protocol.BreventResponse.now()) - (viewHolder.inactive);
            viewHolder.inactiveView.setText(android.text.format.DateUtils.formatElapsedTime(elapsed));
        }else {
            viewHolder.inactiveView.setVisibility(View.GONE);
        }
    }
}