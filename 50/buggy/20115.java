@java.lang.Override
public void dispose() {
    super.dispose();
    getOWLModelManager().removeListener(this.listener);
    this.sqwrlQueryEngineModel.unregisterOntologyListener();
}