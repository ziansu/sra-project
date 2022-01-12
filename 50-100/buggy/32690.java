@org.junit.Test
public void shouldNotAddAnyDataIfNewDataIsEmpty() {
    javax.servlet.http.HttpServletRequest httpServletRequest = mock(javax.servlet.http.HttpServletRequest.class);
    org.motechproject.tama.patient.domain.ReportedOpportunisticInfections updatedOIData = new org.motechproject.tama.patient.domain.ReportedOpportunisticInfections();
    updatedOIData.setPatientId(org.motechproject.tama.web.OpportunisticInfectionsControllerTest.SubjectUnderTest.PATIENT_ID);
    org.motechproject.tama.web.model.OpportunisticInfectionsUIModel opportunisticInfectionsUIModel = org.motechproject.tama.web.model.OpportunisticInfectionsUIModel.create(clinicVisit, updatedOIData, allOpportunisticInfections.getAll());
    opportunisticInfectionsController.update(opportunisticInfectionsUIModel, httpServletRequest);
    verify(allReportedOpportunisticInfections, never()).add(org.mockito.Matchers.<org.motechproject.tama.patient.domain.ReportedOpportunisticInfections>any());
    verify(allClinicVisits).updateOpportunisticInfections(org.motechproject.tama.web.OpportunisticInfectionsControllerTest.SubjectUnderTest.PATIENT_ID, org.motechproject.tama.web.OpportunisticInfectionsControllerTest.SubjectUnderTest.CLINIC_VISIT_ID, null);
}