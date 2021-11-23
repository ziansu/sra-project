@java.lang.Override
public void parametersChanged() {
    super.updateParameterSetFromComponents();
    if (!(chkPreview.isSelected()))
        return ;
    
    switch (compareParameters(parameterSet.getParameters())) {
        case FIRST_PHASE :
            retTimeCluster();
            break;
        case SECOND_PHASE :
            shapeCluster();
            break;
    }
}