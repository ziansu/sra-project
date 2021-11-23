@java.lang.Override
public org.openflexo.foundation.fml.ViewType makeCustomType(java.lang.String configuration) {
    org.openflexo.foundation.fml.ViewPoint viewPoint = null;
    if (configuration != null) {
        viewPoint = getTechnologyAdapter().getTechnologyAdapterService().getServiceManager().getViewPointLibrary().getViewPoint(configuration);
    }else {
        viewPoint = getViewPointType();
    }
    if (viewPoint != null) {
        return org.openflexo.foundation.fml.ViewType.getViewType(viewPoint);
    }else {
        return new org.openflexo.foundation.fml.ViewType(configuration, this);
    }
}