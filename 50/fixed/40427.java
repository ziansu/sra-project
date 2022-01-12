@java.lang.Override
public void onSuccess(org.cloudcoder.app.shared.model.ProblemAndSubscriptionReceipt[] result) {
    getSession().add(result);
}