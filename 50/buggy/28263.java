@java.lang.Override
public java.lang.String getMessage(org.ovirt.engine.ui.uicommonweb.models.hosts.network.NetworkItemModel<?> op1, org.ovirt.engine.ui.uicommonweb.models.hosts.network.NetworkItemModel<?> op2) {
    return appendDetachNetworkSuggestion(getVerb(op1), ((org.ovirt.engine.ui.uicommonweb.models.hosts.network.NetworkInterfaceModel) (op2)));
}