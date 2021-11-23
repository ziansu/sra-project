public java.util.List<domain.Invitation> findInvitationsByTeam(domain.Team team) {
    java.util.List<domain.Invitation> invites = null;
    javax.persistence.Query q = em.createNamedQuery("Invitation.findByTeam");
    q.setParameter("teamid", team.getId());
    for (domain.Invitation inv : ((java.util.List<domain.Invitation>) (q.getResultList()))) {
        if ((inv.getState()) != (domain.Invitation.InvitationState.ACCEPTED)) {
            invites.add(inv);
        }
    }
    return invites;
}