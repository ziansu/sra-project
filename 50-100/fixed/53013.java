public void setAttributionImage(android.content.ComponentName cn) {
    if (cn == null) {
        dialerQuickContact.setAttributionBadge(null);
    }else {
        com.android.phone.common.incall.CallMethodInfo cmi = com.android.phone.common.incall.CallMethodHelper.getCallMethod(cn);
        if (cmi == null) {
            dialerQuickContact.setAttributionBadge(null);
            android.util.Log.v(com.android.dialer.calllog.CallLogListItemViewHolder.TAG, ("Call Method was Null for: " + (cn.toShortString())));
        }else {
            dialerQuickContact.setAttributionBadge(cmi.mBadgeIcon);
        }
    }
}