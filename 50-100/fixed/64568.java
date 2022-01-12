private void setPrev() {
    if ((((_index) - 1) < 0) || (null == (_aiList))) {
        return ;
    }
    final java.util.List<com.estvis.oaslibrary.Data.AdditionalInfo.AddInfo> aiList = _aiList.getList();
    final com.estvis.oaslibrary.Data.AdditionalInfo.AddInfo ai = aiList.get((--(_index)));
    _reference = ai.getReference();
    _infoType = ai.getInfoType();
    com.estvis.oaslibrary.Helpers.GlobalDataHelper.setReference(this, _reference);
    com.estvis.oaslibrary.Helpers.GlobalDataHelper.setInfoType(this, _infoType);
}