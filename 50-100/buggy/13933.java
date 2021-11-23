@java.lang.Override
public void onClick(android.view.View view) {
    if (view == (buttonZoomOut)) {
        zoom = getLowerZoom();
        updateZoom(zoom);
    }else
        if (view == (buttonZoomIn)) {
            zoom = getGreaterZoom();
            updateZoom(zoom);
        }else
            if (view == (buttonCenter))
                pan.centerView();
            
        
    
}