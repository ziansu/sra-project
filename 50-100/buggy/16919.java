@java.lang.Override
protected com.schantz.mydls.dls.policy.BasicInfoPolicyQueryResult doInBackground(java.lang.String... params) {
    com.schantz.mydls.dls.policy.PolicyId policyId = new com.schantz.mydls.dls.policy.PolicyId(this.policyId);
    com.schantz.mydls.dls.policy.BasicInfoPolicyQuery request = new com.schantz.mydls.dls.policy.BasicInfoPolicyQuery("2016-08-19", policyId);
    android.util.Log.i("policy", request.toString());
    com.schantz.mydls.dls.policy.BasicInfoPolicyQueryResult policySummary = com.schantz.mydls.config.RestExecuter.getInstance().getPolicySummary(request);
    return policySummary;
}