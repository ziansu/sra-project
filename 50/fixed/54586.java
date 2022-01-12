@java.lang.Override
public void onItemBind(me.tatarka.bindingcollectionadapter2.ItemBinding itemBinding, int position, org.unimelb.itime.ui.viewmodel.activity.ActivityMessageViewModel item) {
    if (position == 3) {
        itemBinding.set(BR.messageViewGroup, R.layout.itime_activity_message_bottom);
    }else
        if (position < 3) {
            itemBinding.set(BR.messageViewGroup, R.layout.itime_activity_meeting_message);
        }
    
}