public static void initNetcdfFileCache(int minElementsInMemory, int maxElementsInMemory, int hardLimit, int period) {
    ucar.nc2.dataset.NetcdfDataset.netcdfFileCache = new ucar.nc2.util.cache.FileCache("NetcdfFileCache ", minElementsInMemory, maxElementsInMemory, hardLimit, period);
    ucar.nc2.dataset.NetcdfDataset.defaultNetcdfFileFactory = new ucar.nc2.dataset.NetcdfDataset.MyNetcdfFileFactory();
}