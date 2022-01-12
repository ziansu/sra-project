public static void onCreate(android.content.Intent parent, com.aptoide.amethyst.utils.AptoideUtils.AppNavigationUtils.AptoideNavigationInterface navigationInterface) {
    java.lang.String brothers = navigationInterface.getMetaData(com.aptoide.amethyst.utils.AptoideUtils.AppNavigationUtils.BROTHER_KEY);
    if (brothers != null) {
        java.lang.String[] brothersList = brothers.split("\\|");
        for (java.lang.String brother : brothersList) {
            com.aptoide.amethyst.utils.AptoideUtils.AppNavigationUtils.addParentRemovingBrother(parent, brother);
        }
    }else {
        com.aptoide.amethyst.utils.AptoideUtils.AppNavigationUtils.addParent(parent);
    }
}