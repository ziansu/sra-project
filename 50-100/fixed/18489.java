public boolean isVisible(diy.uigeneric.data.Sample sample) {
    boolean b;
    if ((deleted) == null)
        b = (sample.getDeleted()) == null;
    else
        b = (sample.getDeleted()) != null;
    
    if (b && ((category) != null))
        b = (sample.getCategory()) == (category);
    
    if (b && ((query) != null))
        b = sample.getName().contains(query);
    
    return b;
}