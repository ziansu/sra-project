@java.lang.Override
public void destroyedStatus(twitter4j.Status destroyedStatus) {
    if ((jp.gr.java_conf.ya.yumura.Twitter.TwitterAccess.adapter) != null) {
        java.util.List<twitter4j.Status> destroyedStatuss = new java.util.ArrayList<>();
        destroyedStatuss.add(destroyedStatus);
        jp.gr.java_conf.ya.yumura.Twitter.TwitterAccess.adapter.removeDataOf(destroyedStatuss);
        jp.gr.java_conf.ya.yumura.Twitter.TwitterAccess.adapter.notifyDataSetChanged();
        jp.gr.java_conf.ya.yumura.Twitter.TwitterAccess.adapter.showSnackbar("Removed", jp.gr.java_conf.ya.yumura.String.ViewString.getScreennameAndText(destroyedStatus));
    }
}