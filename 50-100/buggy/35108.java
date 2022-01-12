@java.lang.Override
public void setIteratorName(java.lang.String iteratorName) {
    if (!(this.iteratorName.equals(iteratorName))) {
        java.lang.String oldValue = this.iteratorName;
        this.iteratorName = iteratorName;
        getPropertyChangeSupport().firePropertyChange(org.openflexo.foundation.fml.controlgraph.IterationAction.ITERATOR_NAME_KEY, oldValue, iteratorName);
    }
}