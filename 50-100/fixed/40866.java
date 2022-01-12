public boolean bindAttach(com.redsteedstudios.logicalgame.node.Node attached) {
    boolean retVal = false;
    switch (this._node.getOwner()) {
        case node_owner_static :
            {
                retVal = false;
            }
            break;
        case node_owner_dynamic :
            {
                if ((this._attachedNode) == null) {
                    this._attachedNode = attached;
                    recreateNodeView();
                    retVal = true;
                }else {
                    retVal = false;
                }
            }
            break;
    }
    return retVal;
}