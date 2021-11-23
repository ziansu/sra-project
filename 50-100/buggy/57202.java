private void setGroups() throws org.json.JSONException {
    org.json.JSONArray groups;
    if (!(it.polimi.dima.skitalk.util.Utils.fileAlreadyExist(c, "SkiTalkGroupListInfo")))
        groups = downloadGroupList();
    else
        groups = it.polimi.dima.model.User.loadGroupList(c);
    
    for (int i = 0; i < (groups.length()); i++)
        this.groups.add(new it.polimi.dima.model.Group(groups.getJSONObject(i).getInt("id"), c));
    
}