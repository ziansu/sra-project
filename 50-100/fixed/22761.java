public void removeAttachment() {
    switch (this._node.getOwner()) {
        case node_owner_dynamic :
            {
                if ((this._attachedNode) != null) {
                    this._attachedNode = null;
                    recreateNodeView();
                }
            }
            break;
        default :
            break;
    }
}