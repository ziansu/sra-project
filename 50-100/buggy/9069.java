private void setModelForAcceptors(challenge.dbside.models.ChallengeDefinition challenge, org.springframework.ui.Model model) {
    java.util.List acceptors = new java.util.ArrayList(new java.util.HashSet(challenge.getAllAcceptors()));
    int acceptorsOnPage = 6;
    model.addAttribute("listOfAcceptors", ((acceptors.size()) > acceptorsOnPage ? acceptors.subList(0, acceptorsOnPage) : acceptors.subList(0, acceptors.size())));
    model.addAttribute("showAcceptorsExtendenceButton", true);
}