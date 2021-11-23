public com.jbrown.core.data.model.CountryI[] getCountryData() {
    com.jbrown.core.util.io.datafiles.IndianPinCodeFile indianFile = com.jbrown.core.util.io.datafiles.IndianPinCodeFile.getInstance(_request);
    com.jbrown.core.util.io.datafiles.PakistanPinCodeFile pakFile = com.jbrown.core.util.io.datafiles.PakistanPinCodeFile.getInstance(_request);
    com.jbrown.core.util.io.datafiles.UnitedStatesZinCodeFile usaFile = com.jbrown.core.util.io.datafiles.UnitedStatesZinCodeFile.getInstance(_request);
    com.jbrown.core.util.io.datafiles.IsoCountryFile isoFile = com.jbrown.core.util.io.datafiles.IsoCountryFile.getInstance(_request);
    isoFile.getIsoCountryList();
    com.jbrown.core.data.model.CountryI india = indianFile.getCountryInfo();
    com.jbrown.core.data.model.CountryI pak = null;
    com.jbrown.core.data.model.CountryI usa = usaFile.getCountryInfo();
    return new com.jbrown.core.data.model.CountryI[]{ india , pak , usa };
}