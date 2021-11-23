@java.lang.Override
public void onResult(com.google.android.gms.wearable.Node selectedNode) {
    if (selectedNode == null)
        nodeName = null;
    
    nodeName = selectedNode.getDisplayName();
}