public void setAttributionImage(android.content.ComponentName cn) {
    if (cn == null)
        return ;
    
    com.android.phone.common.incall.CallMethodInfo cmi = com.android.phone.common.incall.CallMethodHelper.getCallMethod(cn);
    if (cmi == null) {
        android.util.Log.v(com.android.dialer.calllog.CallLogListItemViewHolder.TAG, ("Call Method was Null for: " + (cn.toShortString())));
    }else {
        dialerQuickContact.setAttributionBadge(cmi.mBadgeIcon);
    }
}