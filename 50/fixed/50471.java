@java.lang.Override
public void setGeneticStructure(java.lang.Object obj) {
    this.cipher = ((com.ciphertool.engine.entities.Cipher) (obj));
    lastRowBegin = (this.cipher.getColumns()) * ((this.cipher.getRows()) - 1);
}