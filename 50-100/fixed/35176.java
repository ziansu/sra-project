@java.lang.Override
protected uk.ac.rdg.resc.edal.dataset.GridDataSource openGridDataSource() throws java.io.IOException {
    ucar.nc2.dataset.NetcdfDataset nc;
    try {
        nc = uk.ac.rdg.resc.edal.dataset.cdm.CdmGridDatasetFactory.openAndAggregateDataset(location);
    } catch (uk.ac.rdg.resc.edal.exceptions.EdalException e) {
        throw new java.io.IOException("Problem aggregating datasets", e);
    }
    synchronized(this) {
        dataSource = new uk.ac.rdg.resc.edal.dataset.cdm.CdmGridDataSource(uk.ac.rdg.resc.edal.util.cdm.CdmUtils.getGridDataset(nc));
    }
    return dataSource;
}