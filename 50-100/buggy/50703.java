@java.lang.Override
public void addMember(java.lang.String email) throws java.rmi.RemoteException {
    for (server.remote_business_enitities.RemoteMemberInterface member : RProjects.remoteMembers) {
        if (member.getEmail().equals(email))
            this.members.add(member);
        
        database.DBdummy.getInstance().updateProject(this);
        server.remote_business_enitities.RProjects.notifyObservers(MessageHeaders.UPDATE, new shared.business_entities.Project(this));
        break;
    }
}