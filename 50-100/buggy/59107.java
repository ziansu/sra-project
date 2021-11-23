public void deleteConnection(advancedsystemsmanager.tileentities.manager.TileEntityManager manager) {
    advancedsystemsmanager.flow.FlowComponent a = manager.getFlowItem(inputId);
    advancedsystemsmanager.flow.FlowComponent b = manager.getFlowItem(outputId);
    if (a != null) {
        a.setConnection(inputConnection, null);
        if (b != null)
            b.setConnection(outputConnection, null);
        
    }
}