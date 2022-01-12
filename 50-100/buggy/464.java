private void inviteMember(java.lang.String member) {
    if (dataProvider.checkProjectMember(loadProjectName, member, loadAccount)) {
        dataProvider.addProjectMember(new com.comet_000.myapplication.TableProjectMember(loadProjectName, loadAccount, member, "Waiting"));
        java.lang.String message = mailManager.makeInvitation(loadProjectName, loadProjectDes, loadAccount);
        com.comet_000.myapplication.MailSender myMailSender = new com.comet_000.myapplication.MailSender(member, "P2P invitation", message, loadAccount, loadPassword, this);
        myMailSender.send();
    }else {
        toastMaker.makeToast("This user has already been invited to project!");
    }
}