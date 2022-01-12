@java.lang.Override
public java.util.List<java.lang.Object> getPacketData(java.util.List<java.lang.Object> list) {
    for (org.halvors.electrometrics.common.component.IComponent component : components) {
        if (component instanceof org.halvors.electrometrics.common.tile.component.ITileNetworkableComponent) {
            org.halvors.electrometrics.common.tile.component.ITileNetworkableComponent tileComponent = ((org.halvors.electrometrics.common.tile.component.ITileNetworkableComponent) (component));
            list.addAll(tileComponent.getPacketData(new java.util.ArrayList<>()));
        }
    }
    return list;
}