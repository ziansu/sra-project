private de.domjos.ideaMantis.soap.MantisTag getTag(java.lang.String name) {
    for (de.domjos.ideaMantis.soap.MantisTag tag : this.getTags()) {
        if (tag.getName().equals(name))
            return tag;
        
    }
    return null;
}