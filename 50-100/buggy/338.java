@java.lang.Override
public void onClick(android.view.View v) {
    expandBeanList.get(groupPosition).getChild().remove(childPosition);
    if ((expandBeanList.get(groupPosition).getChild().size()) <= 0) {
        expandBeanList.remove(groupPosition);
        expandBeanList.get(groupPosition).getGroup().setGroupIsEdit(false);
    }
    adapterCallback.callBack(false, expandBeanList);
    notifyDataSetChanged();
}