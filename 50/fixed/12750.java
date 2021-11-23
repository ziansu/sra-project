public static android.content.Intent newIntent(android.content.Context context, org.hl7.fhir.dstu3.model.Contract contract, ch.usz.c3pro.c3_pro_android_framework.pyromaniac.logic.consent.ConsentTaskOptions options) {
    org.researchstack.backbone.task.Task task = ch.usz.c3pro.c3_pro_android_framework.pyromaniac.Pyro.getContractAsTask(context, contract, options);
    return ch.usz.c3pro.c3_pro_android_framework.consent.ViewConsentTaskActivity.newIntent(context, task);
}