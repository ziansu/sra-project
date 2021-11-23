private void unregisterSpecRelationListener() {
    if ((specRelationContentAdapter) != null) {
        org.eclipse.rmf.reqif10.common.util.ReqIF10Util.getReqIF(specification).getCoreContent().eAdapters().remove(specRelationContentAdapter);
    }
}