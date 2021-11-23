private void returnToQueue(net.echinopsii.ariane.community.core.mapping.ds.blueprintsimpl.service.tools.SessionImpl.SessionWorkerRequest req, java.lang.Object ret) {
    if ((req.getReplyQ()) != null) {
        try {
            req.getReplyQ().put(new net.echinopsii.ariane.community.core.mapping.ds.blueprintsimpl.service.tools.SessionImpl.SessionWorkerReply(false, ret, null));
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
}