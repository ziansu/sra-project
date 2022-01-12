@java.lang.Override
public void onClick(android.view.View v) {
    if (position != (showDetailPosition))
        showDetail(position);
    else
        hideDetail();
    
}