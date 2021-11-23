public boolean equals(java.lang.Object obj) {
    if (obj instanceof org.opendaylight.vtn.javaapi.openstack.beans.FlowFilterVbrBean) {
        org.opendaylight.vtn.javaapi.openstack.beans.FlowFilterVbrBean u = ((org.opendaylight.vtn.javaapi.openstack.beans.FlowFilterVbrBean) (obj));
        return (((this.vtnName.equals(u.vtnName)) && (this.vbrIfName.equals(u.vbrIfName))) && (this.flName.equals(u.flName))) && (this.vbrName.equals(u.vbrName));
    }
    return super.equals(obj);
}