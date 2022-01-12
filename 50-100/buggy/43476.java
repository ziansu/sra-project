private void getAllDataPropertiesRecursive(it.emarolab.amor.owlInterface.OWLDataProperty prop) {
    java.util.Set<it.emarolab.amor.owlInterface.OWLDataProperty> props = getSubDataPropertyOf(prop);
    if (props.isEmpty())
        return ;
    else {
        allDataPropertyRecoursive.addAll(props);
        for (it.emarolab.amor.owlInterface.OWLDataProperty p : props)
            getAllDataPropertiesRecursive(p);
        
    }
}