public void setBiomorph(biomorphHandling.Biomorph biomorph) {
    this.biomorph = biomorph;
    if (biomorph != null)
        for (int i = 0; i < (sliders.length); i++)
            sliders[i].setValue(biomorph.getGenes()[i].getValue());
        
    
}