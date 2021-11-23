public void testDeadChatAccess() {
    shared.logic.Player cit = addPlayer(shared.logic.templates.BasicRoles.Citizen());
    shared.logic.Player ghost = addPlayer(shared.logic.templates.BasicRoles.Ghost());
    shared.logic.Player maf = addPlayer(shared.logic.templates.BasicRoles.Mafioso());
    shared.logic.Player amn = addPlayer(shared.logic.templates.BasicRoles.Amnesiac());
    lynch(ghost, maf, cit, amn);
    partialExcludes(ghost.getChatKeys(), DeadChat.KEY);
}