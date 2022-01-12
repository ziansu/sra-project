@java.lang.Override
public void onClick(final android.view.View view) {
    java.lang.Object tag = view.getTag();
    if ((tag instanceof java.lang.String) && (((java.lang.String) (tag)).startsWith("button")))
        handleTileClick(((java.lang.String) (tag)));
    
}