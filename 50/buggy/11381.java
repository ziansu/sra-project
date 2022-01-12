@java.lang.Override
public void onDestroy() {
    progressDialog.dismiss();
    org.wizbots.labtab.LabTabApplication.getInstance().removeUIListener(org.wizbots.labtab.interfaces.requesters.CreateTokenListener.class, this);
    org.wizbots.labtab.LabTabApplication.getInstance().removeUIListener(org.wizbots.labtab.interfaces.requesters.GetMentorProfileListener.class, this);
    super.onDestroy();
}