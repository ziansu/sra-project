private void returnToQueue(net.echinopsii.ariane.community.core.mapping.ds.blueprintsimpl.service.tools.SessionImpl.SessionWorkerRequest req, net.echinopsii.ariane.community.core.mapping.ds.blueprintsimpl.service.tools.SessionImpl.SessionWorkerReply ret) {
    if ((req.getReplyQ()) != null) {
        try {
            req.getReplyQ().put(ret);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
}