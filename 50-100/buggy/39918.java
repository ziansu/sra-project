public boolean isGenomeSizeAvailable() {
    if ((this.genomeSize) > 0) {
        return true;
    }else
        if (((this.reference) != null) && ((this.reference.getPath()) != null)) {
            return true;
        }else
            if ((this.estimated.getEstGenomeSize()) > 0) {
                return true;
            }else {
                return false;
            }
        
    
}