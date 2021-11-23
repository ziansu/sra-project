public java.lang.Integer addInformationLove(int infoId, java.lang.String userId) throws java.lang.Exception {
    com.dskj.community.entity.InformationLove informationLove = new com.dskj.community.entity.InformationLove();
    informationLove.setInfoId(infoId);
    informationLove.setUserId(userId);
    informationLoveMapper.add(informationLove);
    return informationLove.getId();
}