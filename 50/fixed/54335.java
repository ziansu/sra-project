@java.lang.Override
public int getItemViewType(int position) {
    return position == 0 ? com.project.gu.testnestedscrollingfirst.content.sinaweibo.RefreshAdapter.HEADERTYPE : com.project.gu.testnestedscrollingfirst.content.sinaweibo.RefreshAdapter.ITEMTYPE;
}