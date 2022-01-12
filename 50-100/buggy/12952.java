public void setTemplateID(java.util.Map mobData, com.nkoiv.mists.game.gameobject.MapObject mob) {
    if (mobData.containsKey("templateID")) {
        int templateID = java.lang.Integer.parseInt(((java.lang.String) (mobData.get("templateID"))));
        mob.setTemplateID(templateID);
    }else {
        mob.setTemplateID(getNextFreeID());
    }
}