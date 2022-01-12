private static void updateReqList() {
    javax.swing.DefaultListModel model = new javax.swing.DefaultListModel();
    java.util.ArrayList<disconsented.anssrpg.perk.Requirement> temp = disconsented.anssrpg.gui.Config.currentPerk.getRequirements();
    for (disconsented.anssrpg.perk.Requirement req : temp) {
        model.addElement(req.name);
    }
    disconsented.anssrpg.gui.Config.listRequirement.setModel(model);
    disconsented.anssrpg.gui.Config.listRequirement.updateUI();
}