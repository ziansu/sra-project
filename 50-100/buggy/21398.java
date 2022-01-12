@java.lang.Override
public se.skltp.agp.service.api.QueryObject createQueryObject(org.w3c.dom.Node node) {
    riv.ehr.log.querying.getaccesslogsforpatientresponder.v1.GetAccessLogsForPatientRequestType req = ((riv.ehr.log.querying.getaccesslogsforpatientresponder.v1.GetAccessLogsForPatientRequestType) (se.skltp.aggregatingservices.riv.ehr.log.querying.getaggregatedaccesslogsforpatient.QueryObjectFactoryImpl.ju.unmarshal(node)));
    se.skltp.aggregatingservices.riv.ehr.log.querying.getaggregatedaccesslogsforpatient.QueryObjectFactoryImpl.log.debug("Transformed payload for pid: {}", req.getPatientId());
    se.skltp.agp.riv.itintegration.engagementindex.findcontentresponder.v1.FindContentType fc = new se.skltp.agp.riv.itintegration.engagementindex.findcontentresponder.v1.FindContentType();
    fc.setRegisteredResidentIdentification(req.getPatientId());
    fc.setServiceDomain(null);
    se.skltp.agp.service.api.QueryObject qo = new se.skltp.agp.service.api.QueryObject(fc, req);
    return qo;
}