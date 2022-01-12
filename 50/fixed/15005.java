public void saveRep(org.pentaho.di.repository.Repository rep, org.pentaho.metastore.api.IMetaStore metaStore, org.pentaho.di.repository.ObjectId id_transformation, org.pentaho.di.repository.ObjectId id_step) throws org.pentaho.di.core.exception.KettleException {
    rep.saveStepAttribute(id_transformation, id_step, "sample_size", m_sampleSize);
    rep.saveStepAttribute(id_transformation, id_step, "seed", m_randomSeed);
}