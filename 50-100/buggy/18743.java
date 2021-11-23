@java.lang.Override
public void onCurrentPageSelected(int position) {
    if ((selectPoint) != position) {
        points.get(selectPoint).setImageDrawable(pointDefaultDrawable);
        points.get(position).setImageDrawable(pointSelectDrawable);
        selectPoint = position;
    }
    if ((xPageChangeListener) != null)
        xPageChangeListener.onCurrentPageSelected(position);
    
}