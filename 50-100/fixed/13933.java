@java.lang.Override
public void onClick(android.view.View view) {
    if (view == (buttonZoomOut)) {
        zoom = getLowerZoom();
        updateZoom(zoom, true);
    }else
        if (view == (buttonZoomIn)) {
            zoom = getGreaterZoom();
            updateZoom(zoom, true);
        }else
            if (view == (buttonCenter))
                pan.centerView();
            
        
    
}