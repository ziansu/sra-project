public void deleteClothesTypes(java.util.List<java.lang.Integer> clothesTypeids) throws com.subang.tool.SuException {
    for (java.lang.Integer clothesTypeid : clothesTypeids) {
        com.subang.util.SuUtil.deleteFile(clothesTypeDao.get(clothesTypeid).getIcon());
        clothesTypeDao.delete(clothesTypeid);
    }
}