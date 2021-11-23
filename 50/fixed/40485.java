@java.lang.Override
public boolean annotationDataExists() {
    if (null == (molgenisSettings.getProperty(org.molgenis.data.annotation.impl.HpoServiceAnnotator.HPO_FILE_LOCATION)))
        return false;
    
    return new java.io.File(molgenisSettings.getProperty(org.molgenis.data.annotation.impl.HpoServiceAnnotator.HPO_FILE_LOCATION)).exists();
}