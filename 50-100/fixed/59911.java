@org.junit.Before
public void setUp() throws java.lang.Exception {
    scheduleConfig = new org.opensrp.scheduler.ScheduleConfig("/schedules/schedule-config.xls");
    org.mockito.MockitoAnnotations.initMocks(this);
    fsp = new org.opensrp.service.formSubmission.FormSubmissionProcessor(ziggyService, formSubmissionRouter, formEntityConverter, scheduleService, clientService, eventService);
    fec = new org.opensrp.service.formSubmission.FormEntityConverter(new org.opensrp.form.service.FormAttributeParser("/form"));
}