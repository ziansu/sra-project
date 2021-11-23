private void getAllDataPropertiesRecursive(it.emarolab.amor.owlInterface.OWLDataProperty prop) {
    java.util.Set<it.emarolab.amor.owlInterface.OWLDataProperty> props = getSubDataPropertyOf(prop);
    allDataPropertyRecoursive.addAll(props);
    if (props.isEmpty())
        return ;
    else {
        for (it.emarolab.amor.owlInterface.OWLDataProperty p : props)
            getAllDataPropertiesRecursive(p);
        
    }
}