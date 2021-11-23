public void deleteClothesTypes(java.util.List<java.lang.Integer> clothesTypeids) throws com.subang.tool.SuException {
    for (java.lang.Integer clothesTypeid : clothesTypeids) {
        clothesTypeDao.delete(clothesTypeid);
        com.subang.util.SuUtil.deleteFile(clothesTypeDao.get(clothesTypeid).getIcon());
    }
}