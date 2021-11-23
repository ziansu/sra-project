public static com.ignoretheextraclub.siteswapfactory.siteswap.vanilla.TwoHandedVanillaSiteswap createTHS(final java.lang.String siteswap, final com.ignoretheextraclub.siteswapfactory.sorters.strategy.SortingStrategy<com.ignoretheextraclub.siteswapfactory.siteswap.vanilla.state.VanillaState> sortingStrategy, final boolean reduce) throws com.ignoretheextraclub.siteswapfactory.exceptions.InvalidSiteswapException {
    com.ignoretheextraclub.siteswapfactory.exceptions.InvalidSiteswapException cause = null;
    if (com.ignoretheextraclub.siteswapfactory.SiteswapFactory.VANILLA_SITESWAP_FORMAT.matcher(siteswap).matches()) {
        try {
            return com.ignoretheextraclub.siteswapfactory.SiteswapFactory.createTHS(com.ignoretheextraclub.siteswapfactory.siteswap.vanilla.thros.VanillaThroUtils.stringToIntArray(siteswap), sortingStrategy, reduce);
        } catch (final com.ignoretheextraclub.siteswapfactory.exceptions.InvalidSiteswapException ise) {
            cause = ise;
        }
    }
    throw new com.ignoretheextraclub.siteswapfactory.exceptions.InvalidSiteswapException((("Could not create siteswap from [" + siteswap) + "]"), cause);
}