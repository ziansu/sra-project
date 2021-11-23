public void deleteBanners(java.util.List<java.lang.Integer> bannerids) {
    for (java.lang.Integer bannerid : bannerids) {
        bannerDao.delete(bannerid);
        com.subang.util.SuUtil.deleteFile(bannerDao.get(bannerid).getIcon());
    }
}