protected void handleRequestQueue() {
    if ((!(locked)) && (!(requestQueue.isEmpty()))) {
        int reqId = ((int) (requestQueue.peek()[1]));
        locked = true;
        if ((nodeId) == reqId) {
            permission_received_from_quorum.add(nodeId);
            if (permission_received_from_quorum.equals(obNode.qset)) {
                actualEnterCS();
            }
        }else {
            nodeLastGrant = reqId;
            sendByType(Application.ServerBase.MESSAGE_TYPE.GRANT, reqId);
        }
    }
}