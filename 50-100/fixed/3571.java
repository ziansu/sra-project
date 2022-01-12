public com.pihen.d3restapi.beans.SeasonalProfile getSeason(java.lang.String season) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.reflect.InvocationTargetException {
    java.lang.reflect.Method m = this.getClass().getMethod(("getSeason" + season), new java.lang.Class[]{  });
    com.pihen.d3restapi.beans.Season.logger.debug(("Call dynamic season method" + m));
    java.lang.Object ret = m.invoke(org.armory.d3.services.D3ArmoryControler.getInstance().getCurrentProfil().getSeasonalProfiles());
    return ((com.pihen.d3restapi.beans.SeasonalProfile) (ret));
}