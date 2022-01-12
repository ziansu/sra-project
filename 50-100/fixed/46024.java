@java.lang.Override
public void bindView(tellh.com.recyclertreeview.viewbinder.DirectoryNodeBinder.ViewHolder holder, int position, tellh.com.recyclertreeview_lib.TreeNode node) {
    holder.ivArrow.setRotation(0);
    holder.ivArrow.setImageResource(R.drawable.ic_keyboard_arrow_right_black_18dp);
    int rotateDegree = (node.isExpand()) ? 90 : 0;
    holder.ivArrow.setRotation(rotateDegree);
    tellh.com.recyclertreeview.bean.Dir dirNode = ((tellh.com.recyclertreeview.bean.Dir) (node.getContent()));
    holder.tvName.setText(dirNode.dirName);
    if (node.isLeaf())
        holder.ivArrow.setVisibility(View.INVISIBLE);
    else
        holder.ivArrow.setVisibility(View.VISIBLE);
    
}